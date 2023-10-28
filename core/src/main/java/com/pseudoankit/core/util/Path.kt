package com.pseudoankit.core.util

import androidx.compose.ui.graphics.Path

fun buildPath(block: Path.() -> Unit) = Path().apply {
    block()
    close()
}