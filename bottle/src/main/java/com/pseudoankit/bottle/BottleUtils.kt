package com.pseudoankit.bottle

import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.DrawScope

private const val capHeightFraction = .12f

internal fun DrawScope.drawCap(
    color: Color
) {

    val capWidth = size.width.times(.5f)
    val capHeight = size.height.times(capHeightFraction)
    drawRoundRect(
        color = color,
        size = Size(capWidth, capHeight),
        topLeft = Offset(size.width.div(2) - capWidth.div(2), 0f),
        cornerRadius = CornerRadius(45f, 45f)
    )
}

internal fun DrawScope.drawWaterPath(
    waterWavesPercentage: Float,
    color: Color
) {
    val width = size.width
    val height = size.height

    val waterWaves = (1 - waterWavesPercentage) * height
    val path = Path().apply {
        moveTo(0f, waterWaves)
        lineTo(width, waterWaves)
        lineTo(width, height)
        lineTo(0f, height)
        close()
    }

    drawPath(
        path = path,
        color = color
    )
}

internal fun DrawScope.bottlePath(): Path {
    val width = size.width
    val height = size.height

    return Path().apply {
        moveTo(
            x = width.times(.3f), y = height.times(.1f)
        )
        lineTo(
            x = width.times(.3f), y = height.times(.2f)
        )
        quadraticBezierTo(
            x1 = 0f, y1 = height.times(.25f),
            x2 = 0f, y2 = height.times(.45f),
        )
        lineTo(
            x = 0f, y = height.times(.95f)
        )
        quadraticBezierTo(
            x1 = 0f, y1 = height,
            x2 = width.times(.05f), y2 = height,
        )
        lineTo(
            x = width.times(.95f), y = height
        )
        quadraticBezierTo(
            x1 = width, y1 = height,
            x2 = width, y2 = height.times(.95f),
        )
        lineTo(
            x = width, y = height.times(.4f)
        )
        quadraticBezierTo(
            x1 = width, y1 = height.times(.25f),
            x2 = width.times(.7f), y2 = height.times(.2f),
        )
        lineTo(
            x = width.times(.7f), y = height.times(.1f)
        )
        close()
    }
}