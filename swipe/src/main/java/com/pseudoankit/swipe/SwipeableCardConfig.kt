package com.pseudoankit.swipe

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * @param direction specify the [SwipeDirection] of swipe in which user can move
 * @param maxOffsetToReveal maximum limit until which user can swipe the view and swiping further will have no effect
 * @param revealThreshold value till which if user drags, then view will be swiped to [maxOffsetToReveal],
 * eg: if [revealThreshold] is 20 then if user swipe value is >= 20 then it will automatically be swiped to [maxOffsetToReveal]
 * @param offsetValue initial offset value, value by which card will be swiped as per [direction] specified
 * @param elevationWhenRevealed elevation value when view is swiped
 */
data class SwipeableCardConfig(
    val direction: SwipeDirection,
    private val maxOffsetToReveal: Float,
    val revealThreshold: Float,
    val offsetValue: Float = 0f,
    val elevationWhenRevealed: Dp = 4.dp,
) {

    internal val maximumOffsetToReveal
        get() = when (direction) {
            SwipeDirection.RTL -> -maxOffsetToReveal
            SwipeDirection.LTR -> maxOffsetToReveal
        }
}


/** direction of swipe movement */
enum class SwipeDirection {
    /** Right to Left */
    RTL,

    /** Left to Right */
    LTR
}