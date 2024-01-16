package com.example.presentationcard.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.presentationcard.R


private val indie = FontFamily(
    Font(R.font.indieflower_regular,
    FontWeight.Normal
    )
)
// Set of Material typography styles to start with
val Typography = Typography(
    titleLarge = TextStyle(
        fontFamily = indie,
        fontWeight = FontWeight.Normal,
        fontSize = 48.sp,
    ),
    titleMedium = TextStyle(
        fontFamily = indie,
        fontWeight = FontWeight.Normal,
        fontSize = 30.sp,
    ),
    bodyLarge = TextStyle(
        fontFamily = indie,
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp,
    )
  /* bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )*/
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)