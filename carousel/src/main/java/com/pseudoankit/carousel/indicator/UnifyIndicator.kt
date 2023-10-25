package com.pseudoankit.carousel.indicator

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

enum class UnifyIndicatorType {
    Dots
}

@Composable
fun UnifyIndicator(
    selectedIndex: Int,
    itemsCount: Int,
    modifier: Modifier = Modifier,
    maxVisibleIndicator: Int = 5,
    type: UnifyIndicatorType = UnifyIndicatorType.Dots
) {

    val listState = rememberLazyListState()

    LaunchedEffect(selectedIndex) {
        listState.animateScrollToItem(selectedIndex)
    }

    LazyRow(
        state = listState,
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally)
    ) {
        items(itemsCount) { index ->
            when (type) {
                UnifyIndicatorType.Dots -> {
                    DotIndicator(
                        currentIndex = index,
                        selectedIndex = selectedIndex,
                        maxVisibleIndicator = maxVisibleIndicator,
                        itemsCount = itemsCount
                    )
                }
            }
        }
    }
}
