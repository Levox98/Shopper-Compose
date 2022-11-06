package com.levox.composeshopper

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.levox.base_ui.theme.AppTheme
import com.levox.navigation.MainNavigationGraph
import com.levox.ui_shopping_cart.addMain

@Composable
fun AppScreen(navController: NavHostController) {

    AppTheme {
        NavHost(
            navController = navController,
            route = "APPLICATION_ROOT",
            startDestination = MainNavigationGraph.Root.route
        ) {
            addMain(navController)
        }
    }
}