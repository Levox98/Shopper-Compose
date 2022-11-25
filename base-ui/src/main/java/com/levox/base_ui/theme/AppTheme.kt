package com.levox.base_ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.LocalTextStyle
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.compositeOver
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.TextStyle
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Immutable
data class AppColors(
    val primary: Color,
    val secondary: Color,
    val tertiary: Color,
    val onPrimary: Color
)

@Immutable
data class AppTypography(
    val h0: TextStyle,
    val h1: TextStyle,
    val h2: TextStyle,
    val h3: TextStyle,
    val body1: TextStyle,
    val body2: TextStyle,
    val title1: TextStyle,
    val title2: TextStyle,
    val title3: TextStyle,
    val button1: TextStyle
)

@Immutable
data class AppShapes(
    val small: RoundedCornerShape,
    val medium: RoundedCornerShape,
    val large: RoundedCornerShape,
    val rounded: RoundedCornerShape
)

@Immutable
data class AppDimensions(
    val screenWidthDp: Int,
    val screenHeightDp: Int
)

val LocalAppColors = staticCompositionLocalOf<AppColors> {
    error("No colors provided")
}

val LocalAppTypography = staticCompositionLocalOf<AppTypography> {
    error("No typography provided")
}

val LocalAppShapes = staticCompositionLocalOf<AppShapes> {
    error("No shapes provided")
}

val LocalAppDimensions = staticCompositionLocalOf<AppDimensions> {
    error("No dimensions provided")
}


@Composable
fun AppTheme(
    content: @Composable () -> Unit
) {
    TransparentSystemBars()

    val appColors = AppColors(
        primary = colorBlue,
        secondary = colorLightBlue,
        tertiary = colorDarkBlue,
        onPrimary = colorWhite
    )

    val appTypography = AppTypography(
        h0 = typoH0,
        h1 = typoH1,
        h2 = typoH2,
        h3 = typoH3,
        body1 = typoBody1,
        body2 = typoBody2,
        title1 = typoTitle1,
        title2 = typoTitle2,
        title3 = typoTitle3,
        button1 = typoButton1
    )

    val appShapes = AppShapes(
        small = shapeSmall,
        medium = shapeMedium,
        large = shapeLarge,
        rounded = shapeRounded
    )

    val configuration = LocalConfiguration.current
    val appDimensions = AppDimensions(
        screenWidthDp = configuration.screenWidthDp,
        screenHeightDp = configuration.screenHeightDp
    )

    CompositionLocalProvider(
        LocalAppColors provides appColors,
        LocalAppTypography provides appTypography,
        LocalAppShapes provides appShapes,
        LocalAppDimensions provides appDimensions,
        LocalTextStyle provides appTypography.body1,
        content = content
    )
}

private val blackScrim = Color(0f, 0f, 0f, .3f)

@Composable
fun TransparentSystemBars() {
    val useDarkIcons = !isSystemInDarkTheme()
    val systemUiController = rememberSystemUiController()

    systemUiController.setNavigationBarColor(
        color = Color.Transparent,
        darkIcons = useDarkIcons,
        navigationBarContrastEnforced = false,
        transformColorForLightContent = { original ->
            blackScrim.compositeOver(original)
        }
    )

    systemUiController.setStatusBarColor(
        color = Color.Transparent,
        darkIcons = false,
        transformColorForLightContent = { original ->
            blackScrim.compositeOver(original)
        }
    )
}

object AppTheme {
    val colors: AppColors
        @Composable
        get() = LocalAppColors.current
    val typography: AppTypography
        @Composable
        get() = LocalAppTypography.current
    val shapes: AppShapes
        @Composable
        get() = LocalAppShapes.current
    val dimensions: AppDimensions
        @Composable
        get() = LocalAppDimensions.current
}