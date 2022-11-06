package com.levox.navigation

sealed class AddItemNavigationGraph : BaseNav() {
    object Root : AddItemNavigationGraph() {
        override val route = "AddItem"
        override val first = true
    }

    object AddItemScreen : AddItemNavigationGraph() {
        override val route = "AddItemScreen"
        override val first = true
    }
}