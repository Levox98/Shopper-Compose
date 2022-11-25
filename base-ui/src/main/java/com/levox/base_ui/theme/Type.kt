package com.levox.base_ui.theme

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.levox.base_ui.R

private val appFontFamily = FontFamily(
    fonts = listOf(
        Font(
            resId = R.font.roboto_bold,
            weight = FontWeight.W700,
            style = FontStyle.Normal
        ),
        Font(
            resId = R.font.roboto_regular,
            weight = FontWeight.Normal,
            style = FontStyle.Normal
        ),
        Font(
            resId = R.font.roboto_medium,
            weight = FontWeight.Medium,
            style = FontStyle.Normal
        ),
        Font(
            resId = R.font.roboto_light,
            weight = FontWeight.Light,
            style = FontStyle.Normal
        ),
        Font(
            resId = R.font.roboto_medium_italic,
            weight = FontWeight.Normal,
            style = FontStyle.Italic
        ),
    )
)

private val defaultTextStyle = TextStyle(
    fontFamily = appFontFamily,
    fontStyle = FontStyle.Normal
)

val typoH0 = defaultTextStyle.copy(fontSize = 30.sp, fontWeight = FontWeight.Medium)
val typoH1 = defaultTextStyle.copy(fontSize = 20.sp, fontWeight = FontWeight.Medium)
val typoH2 = defaultTextStyle.copy(fontSize = 16.sp, fontWeight = FontWeight.Medium)
val typoH3 = defaultTextStyle.copy(fontSize = 16.sp, fontWeight = FontWeight.Bold)
val typoBody1 = defaultTextStyle.copy(fontSize = 14.sp, fontWeight = FontWeight.Normal)
val typoBody2 = defaultTextStyle.copy(fontSize = 15.sp, fontWeight = FontWeight.Normal)
val typoTitle1 = defaultTextStyle.copy(fontSize = 12.sp, fontWeight = FontWeight.Bold)
val typoTitle2 = defaultTextStyle.copy(fontSize = 12.sp, fontWeight = FontWeight.Medium)
val typoTitle3 = defaultTextStyle.copy(fontSize = 11.sp, fontWeight = FontWeight.Normal)
val typoButton1 = defaultTextStyle.copy(fontSize = 15.sp, fontWeight = FontWeight.Medium)
