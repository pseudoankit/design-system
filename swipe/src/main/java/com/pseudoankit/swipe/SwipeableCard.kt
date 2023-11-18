package com.pseudoankit.swipe

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.gestures.detectHorizontalDragGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.input.pointer.positionChange
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import kotlin.math.roundToInt

private const val MIN_OFFSET_TO_REVEAL: Float = 0f
private const val ANIMATION_DURATION = 500

/**
 * wrapper to create a swipeable view
 * @param config [SwipeableCardConfig] configurations of swipeable view
 * @param shape shape of view
 * @param color background color of view
 * @param border border to be drawn on view
 * @param content actual content inside the view
 * to disable default elevation can pass [SwipeableCardConfig.elevationWhenRevealed] as 0.dp
 */
@Composable
fun SwipeableCard(
    config: SwipeableCardConfig,
    modifier: Modifier = Modifier,
    shape: Shape = RoundedCornerShape(16.dp),
    color: Color = MaterialTheme.colorScheme.surface,
    border: BorderStroke? = null,
    content: @Composable () -> Unit
) = with(config) {
    var dragAmount by remember { mutableStateOf(0f) }
    var currentOffset by remember(offsetValue) { mutableStateOf(offsetValue) }
    val displayOffset by remember {
        derivedStateOf {
            when (direction) {
                SwipeDirection.RTL -> {
                    when {
                        currentOffset > MIN_OFFSET_TO_REVEAL -> -MIN_OFFSET_TO_REVEAL
                        currentOffset < maximumOffsetToReveal -> maximumOffsetToReveal
                        else -> currentOffset
                    }
                }

                SwipeDirection.LTR -> {
                    when {
                        currentOffset < MIN_OFFSET_TO_REVEAL -> MIN_OFFSET_TO_REVEAL
                        currentOffset > maximumOffsetToReveal -> maximumOffsetToReveal
                        else -> currentOffset
                    }
                }
            }
        }
    }
    val elevation by animateDpAsState(
        targetValue = if (displayOffset != 0f) elevationWhenRevealed else 0.dp,
        animationSpec = tween(durationMillis = ANIMATION_DURATION), label = ""
    )

    Surface(
        modifier = modifier
            .offset { IntOffset((displayOffset).roundToInt(), 0) }
            .pointerInput(Unit) {
                detectHorizontalDragGestures(
                    onDragEnd = {
                        currentOffset = when (direction) {
                            SwipeDirection.RTL -> {
                                if (-currentOffset < revealThreshold || dragAmount > 0) MIN_OFFSET_TO_REVEAL else maximumOffsetToReveal
                            }

                            SwipeDirection.LTR -> {
                                if (currentOffset < revealThreshold || dragAmount < 0) MIN_OFFSET_TO_REVEAL else maximumOffsetToReveal
                            }
                        }
                    }
                ) { change, dragValue ->
                    dragAmount = dragValue
                    currentOffset += dragValue
                    if (change.positionChange() != Offset.Zero) change.consume()
                }
            },
        shadowElevation = elevation,
        tonalElevation = elevation,
        shape = shape,
        color = color,
        content = content,
        border = border
    )
}

@Preview
@Composable
fun SwipeableCardPreview() {
    Column(
        modifier = Modifier.padding(8.dp),
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Text(text = "SwipeableCard")
        SwipeDirection.entries.forEach { direction ->
            SwipeableCard(
                config = SwipeableCardConfig(
                    direction = direction,
                    maxOffsetToReveal = 200f,
                    revealThreshold = 50f
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                color = Color.Blue,
                shape = RoundedCornerShape(12.dp)
            ) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Text(text = direction.displayName, color = Color.White)
                }
            }
        }
    }
}

private val SwipeDirection.displayName
    get() = when (this) {
        SwipeDirection.RTL -> "Right to Left"
        SwipeDirection.LTR -> "Left to Right"
    }
