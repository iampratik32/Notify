package com.gh0osty.notificationlistener.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.Dp
import com.gh0osty.notificationlistener.R
import com.gh0osty.notificationlistener.utils.NDimension

@Composable
fun NDivider(
    modifier: Modifier = Modifier,
    height: Dp = NDimension().PADDING_0,
    color: Int = R.color.divider
) {
    Divider(
        color = colorResource(color),
        thickness = height,
        modifier = modifier
            .fillMaxWidth()
    )
}