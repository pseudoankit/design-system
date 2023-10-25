package com.pseudoankit.carousel

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.pseudoankit.carousel.indicator.UnifyIndicator
import com.pseudoankit.carousel.indicator.UnifyIndicatorType
import kotlinx.collections.immutable.ImmutableList

/*
0 1 2 3 4 5 1 0
*/

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun <T> UnifyCarousel(
    items: ImmutableList<T>,
    modifier: Modifier = Modifier,
    selectedIndex: Int = 0,
    maxVisibleIndicators: Int = 5,
    content: @Composable (T) -> Unit
) {
    val pagerState = rememberPagerState(
        initialPage = selectedIndex,
        pageCount = { items.size }
    )

    LaunchedEffect(selectedIndex) {
        pagerState.animateScrollToPage(selectedIndex)
    }

    Column(
        modifier = modifier.fillMaxWidth()
    ) {
        HorizontalPager(
            state = pagerState,
            modifier = Modifier.wrapContentSize()
        ) {
            content(items[it])
        }
        Spacer(modifier = Modifier.height(8.dp))
        UnifyIndicator(
            type = UnifyIndicatorType.Dots,
            selectedIndex = pagerState.currentPage,
            maxVisibleIndicator = maxVisibleIndicators,
            itemsCount = items.size
        )
    }
}
