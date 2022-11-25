package com.levox.base_ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.levox.base_ui.theme.AppTheme

@Composable
fun TopBar(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    TopAppBar(
        modifier = modifier,
        backgroundColor = AppTheme.colors.primary,
        contentColor = AppTheme.colors.onPrimary,
        elevation = 0.dp,
        contentPadding = WindowInsets.statusBars.only(WindowInsetsSides.Top).asPaddingValues()
    ) {
        Box(modifier = Modifier.padding(horizontal = 24.dp)) {
            content()
        }
    }
}