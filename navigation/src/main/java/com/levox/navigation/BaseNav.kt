package com.levox.navigation

import androidx.navigation.NavHostController

abstract class BaseNav {
    abstract val route: String
    protected open val url: String? = null
    protected open val first: Boolean = false
    protected open val popUpTo: BaseNav? = null

    open fun navigate(navController: NavHostController) {
        navController.navigate(url ?: route) {
            if (first) {
                popUpTo("APPLICATION_ROOT") {
                    inclusive = true
                    saveState = true
                }
            } else if (this@BaseNav.popUpTo != null) {
                popUpTo(this@BaseNav.popUpTo!!.route) {
                    inclusive = false
                    saveState = true
                }
            }
        }
    }
}

object NavigationBack : BaseNav() {
    override val route: String = ""
    override fun navigate(navController: NavHostController) {
        navController.popBackStack()
    }
}