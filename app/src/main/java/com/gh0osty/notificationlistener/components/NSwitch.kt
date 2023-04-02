package com.gh0osty.notificationlistener.components

import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import com.gh0osty.notificationlistener.R

@Preview(showBackground = true)
@Composable
fun NSwitchPreview() {
    val (checked, setChecked) = remember { mutableStateOf(false) }
    NSwitch(isChecked = checked, setChecked = setChecked)
}

@Composable
fun NSwitch(modifier: Modifier = Modifier, isChecked: Boolean, setChecked: (Boolean) -> Unit) {
    Switch(
        modifier = modifier,
        checked = isChecked, onCheckedChange = {
            setChecked(!isChecked)
        }, colors = SwitchDefaults.colors(
            checkedTrackColor = colorResource(R.color.secondary),
        )
    )
}