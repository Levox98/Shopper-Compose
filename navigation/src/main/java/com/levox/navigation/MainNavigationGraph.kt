package com.levox.navigation

sealed class MainNavigationGraph : BaseNav() {
    object Root : MainNavigationGraph() {
        override val route = "Main"
        override val first = true
    }

    object MainScreen : MainNavigationGraph() {
        override val route = "MainScreen"
        override val first = true
    }

    class ItemScreen(itemId: Int) : MainNavigationGraph() {
        override val route = "MainScreen/Item/{itemId}"
        override val first = false
        override val url = "MainScreen/Item/${itemId}"
    }

    object AddItemScreen : MainNavigationGraph() {
        override val route = "MainScreen/AddItem"
        override val first = false
    }
}