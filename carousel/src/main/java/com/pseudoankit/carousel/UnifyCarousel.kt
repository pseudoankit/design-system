package com.pseudoankit.carousel

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
    maxVisibleIndicator: Int = 5,
    content: @Composable (T) -> Unit
) {
    val pagerState = rememberPagerState(
        initialPage = selectedIndex,
        pageCount = { items.size }
    )

    HorizontalPager(
        state = pagerState,
        modifier = modifier
    ) {
        content(items[it])
    }
}
