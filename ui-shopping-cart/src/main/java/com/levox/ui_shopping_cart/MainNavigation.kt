package com.levox.ui_shopping_cart

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.levox.navigation.MainNavigationGraph
import com.levox.ui_shopping_cart.screen.MainScreen
import com.levox.ui_shopping_item.screen.AddItemScreen
import com.levox.ui_shopping_item.screen.ItemScreen

fun NavGraphBuilder.addMain(navHostController: NavHostController) {
    navigation(MainNavigationGraph.MainScreen.route, MainNavigationGraph.Root.route) {
        composable(MainNavigationGraph.MainScreen.route) {
            MainScreen()
        }
        composable(MainNavigationGraph.AddItemScreen.route) {
            AddItemScreen()
        }
        composable(MainNavigationGraph.ItemScreen().route) {
            ItemScreen()
        }
    }
}