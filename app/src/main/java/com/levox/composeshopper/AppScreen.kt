package com.levox.composeshopper

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.levox.base_ui.theme.AppTheme

@Composable
fun AppScreen(navController: NavHostController) {

    AppTheme {
        NavHost(
            navController = navController,
            route = "APPLICATION_ROOT",
            startDestination = ""
        ) {

        }
    }
}