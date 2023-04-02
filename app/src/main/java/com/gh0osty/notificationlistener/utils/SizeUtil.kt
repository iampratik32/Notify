package com.gh0osty.notificationlistener.utils

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class NDimension(
    val PADDING_0: Dp = 1.dp,
    val PADDING_025: Dp = 2.dp,
    val PADDING_05: Dp = 4.dp,
    val PADDING_075: Dp = 6.dp,
    val PADDING: Dp = 8.dp,
    val PADDING_125: Dp = 10.dp,
    val PADDING_105: Dp = 12.dp,
    val PADDING_175: Dp = 14.dp,
    val PADDING2: Dp = 16.dp,
    val PADDING_225: Dp = 18.dp,
    val PADDING_205: Dp = 20.dp,
    val PADDING_275: Dp = 22.dp,
    val PADDING3: Dp = 24.dp,
)

data class NTypo(
    val HEADLINE_1: TextUnit = 96.sp,
    val HEADLINE_2: TextUnit = 60.sp,
    val HEADLINE_3: TextUnit = 48.sp,
    val HEADLINE_4: TextUnit = 34.sp,
    val HEADLINE_5: TextUnit = 24.sp,
    val HEADLINE_6: TextUnit = 20.sp,
    val BODY: TextUnit = 16.sp,
    val BODY_2: TextUnit = 14.sp,
    val CAPTION: TextUnit = 12.sp,
    val OVERLINE: TextUnit = 10.sp,
)

data class NSpacing(
    val HEADLINE_1: TextUnit = (-1.5).sp,
    val HEADLINE_2: TextUnit = (-0.5).sp,
    val HEADLINE_3: TextUnit = 0.sp,
    val HEADLINE_4: TextUnit = 0.25.sp,
    val HEADLINE_6: TextUnit = 0.15.sp,
    val BODY: TextUnit = 0.5.sp,
    val BUTTON: TextUnit = 1.25.sp,
    val OVERLINE: TextUnit = 1.5.sp,
    val CAPTION: TextUnit = 0.4.sp,
    val SUBTITLE2: TextUnit = 0.1.sp,
)
