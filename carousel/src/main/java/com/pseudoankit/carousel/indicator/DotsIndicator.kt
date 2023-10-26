package com.pseudoankit.carousel.indicator

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

private val dotIndicatorSize = 12.dp
private val indicatorsSpacing = 8.dp

@Composable
internal fun DotsIndicator(
    itemsCount: Int,
    selectedIndex: Int,
    fullVisibleIndicators: Int,
    halfVisibleIndicators: Int,
    listState: LazyListState
) {
    val rowSize = indicatorsViewWidth(
        fullVisibleIndicators = fullVisibleIndicators,
        halfVisibleIndicators = halfVisibleIndicators
    )

    LazyRow(
        state = listState,
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier.size(rowSize),
    ) {
        items(itemsCount) { index ->
            val isSelected = index == selectedIndex

            Box(
                modifier = Modifier
                    .size(dotIndicatorSize)
                    .clip(CircleShape)
                    .background(isSelected.dotColor)
            )
        }
    }
}

private val Boolean.dotColor get() = if (this) Color.Black else Color.Gray

@Composable
fun indicatorsViewWidth(
    fullVisibleIndicators: Int,
    halfVisibleIndicators: Int,
): Dp {
    val maxIndicators = fullVisibleIndicators + halfVisibleIndicators
    return remember(maxIndicators) {
        indicatorsSpacing.times(maxIndicators - 1) + dotIndicatorSize.times(maxIndicators)
    }
}
