package com.pseudoankit.bottle

import androidx.annotation.FloatRange
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.clipPath
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun UnifyBottle(
    @FloatRange(0.0, 100.0) waterPercentage: Float,
    modifier: Modifier = Modifier,
    waterColor: Color = Color(0xff279eff),
    bottleColor: Color = Color.White,
    capColor: Color = Color(0xff0065b9),
) {
    val waterWavesPercentage by animateFloatAsState(
        targetValue = waterPercentage / 100f,
        label = "water percentage waves",
        animationSpec = tween(1000)
    )

    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Canvas(modifier = Modifier.fillMaxSize()) {
            clipPath(
                path = bottlePath()
            ) {
                // background
                drawRect(
                    color = bottleColor,
                    size = size
                )

                drawWaterPath(
                    waterWavesPercentage = waterWavesPercentage,
                    color = waterColor
                )
            }

            drawCap(color = capColor)
        }
    }
}

@Preview
@Composable
fun UnifyBottlePreview() {
    var waterPercentage by remember {
        mutableFloatStateOf(0f)
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        UnifyBottle(
            waterPercentage = waterPercentage,
            modifier = Modifier
                .height(650.dp)
                .width(250.dp)
        )

        Button(onClick = {
            waterPercentage += 5f
        }) {
            Text(text = "Increase water by 5%")
        }
    }
}
