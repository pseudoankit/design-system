package com.pseudoankit.carousel

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.R
import kotlinx.collections.immutable.toImmutableList

@Preview
@Composable
fun UnifyCarouselDemo() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        UnifyCarousel(
            items = (1..10).map { "f" }.toImmutableList()
        ) {
            Column(
                modifier = Modifier
                    .shadow(elevation = 2.dp)
                    .padding(vertical = 12.dp, horizontal = 8.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_call_answer),
                    contentDescription = "",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp)
                )
            }
        }
    }
}
