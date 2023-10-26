package com.pseudoankit.carousel.indicator

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

enum class UnifyIndicatorType {
    Dots
}

@Composable
fun UnifyIndicator(
    selectedIndex: Int,
    itemsCount: Int,
    modifier: Modifier = Modifier,
    fullVisibleIndicators: Int = 5,
    halfVisibleIndicators: Int = 2,
    type: UnifyIndicatorType = UnifyIndicatorType.Dots
) {
    val listState = rememberLazyListState()

    LaunchedEffect(selectedIndex) {
        listState.animateScrollToItem(selectedIndex)
    }

    Box(
        modifier = modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        when (type) {
            UnifyIndicatorType.Dots -> {
                DotsIndicator(
                    itemsCount = itemsCount,
                    selectedIndex = selectedIndex,
                    fullVisibleIndicators = fullVisibleIndicators,
                    halfVisibleIndicators = halfVisibleIndicators,
                    listState = listState
                )
            }
        }
    }
}
