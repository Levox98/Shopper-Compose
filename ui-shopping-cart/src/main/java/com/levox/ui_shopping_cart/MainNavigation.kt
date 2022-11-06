package com.levox.ui_shopping_cart

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.levox.navigation.MainNavigationGraph
import com.levox.ui_shopping_cart.screen.MainScreen

fun NavGraphBuilder.addMain(navController: NavHostController) {
    composable(MainNavigationGraph.MainScreen.route) {
        MainScreen()
    }
    composable(MainNavigationGraph.AddItemScreen.route) {

    }
    composable(MainNavigationGraph.ItemScreen().route) {

    }
}