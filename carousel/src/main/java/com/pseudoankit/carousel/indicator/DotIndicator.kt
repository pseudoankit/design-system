package com.pseudoankit.carousel.indicator

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
internal fun DotIndicator(
    currentIndex: Int,
    maxVisibleIndicator: Int,
    itemsCount: Int,
    selectedIndex: Int
) {
    val isSelected = currentIndex == selectedIndex

    Box(
        modifier = Modifier
            .size(12.dp)
            .clip(CircleShape)
            .background(isSelected.dotColor)
    )
}

private val Boolean.dotColor get() = if (this) Color.Black else Color.Gray
