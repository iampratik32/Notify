package com.gh0osty.notificationlistener.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import com.gh0osty.notificationlistener.R
import com.gh0osty.notificationlistener.utils.NSpacing
import com.gh0osty.notificationlistener.utils.NTypo

@Composable
fun NText(
    modifier: Modifier = Modifier, text: String?,
    textType: String = TextType.BODY.name,
    fontStyle: FontStyle = FontStyle(0),
    color: Color = colorResource(R.color.dark),
    textAlign: TextAlign = TextAlign.Left,
    maxLines: Int = Int.MAX_VALUE,
    onTextLayout: (TextLayoutResult) -> Unit = {},
) {
    var fontSize = NTypo().BODY
    var letterSpacing = NSpacing().BODY
    var fontWeight = FontWeight.Normal

    when (textType) {
        TextType.HEADLINE1.name -> {
            fontSize = NTypo().HEADLINE_1
            letterSpacing = NSpacing().HEADLINE_1
            fontWeight = FontWeight.Light
        }
        TextType.HEADLINE2.name -> {
            fontSize = NTypo().HEADLINE_2
            letterSpacing = NSpacing().HEADLINE_2
            fontWeight = FontWeight.Light
        }
        TextType.HEADLINE3.name -> {
            fontSize = NTypo().HEADLINE_3
            letterSpacing = NSpacing().HEADLINE_3
            fontWeight = FontWeight.Normal
        }
        TextType.HEADLINE4.name -> {
            fontSize = NTypo().HEADLINE_4
            letterSpacing = NSpacing().HEADLINE_4
            fontWeight = FontWeight.Normal
        }
        TextType.HEADLINE5.name -> {
            fontSize = NTypo().HEADLINE_5
            letterSpacing = NSpacing().HEADLINE_3
            fontWeight = FontWeight.Normal
        }
        TextType.HEADLINE6.name -> {
            fontSize = NTypo().HEADLINE_6
            letterSpacing = NSpacing().HEADLINE_6
            fontWeight = FontWeight.Medium
        }
        TextType.SUBTITLE.name -> {
            fontSize = NTypo().BODY
            letterSpacing = NSpacing().HEADLINE_6
            fontWeight = FontWeight.Normal
        }
        TextType.SUBTITLE2.name -> {
            fontSize = NTypo().BODY_2
            letterSpacing = NSpacing().SUBTITLE2
            fontWeight = FontWeight.Medium
        }
        TextType.BODY2.name -> {
            fontSize = NTypo().BODY_2
            letterSpacing = NSpacing().HEADLINE_4
            fontWeight = FontWeight.Normal
        }
        TextType.BUTTON.name -> {
            fontSize = NTypo().BODY_2
            letterSpacing = NSpacing().BUTTON
            fontWeight = FontWeight.Medium
        }
        TextType.CAPTION.name -> {
            fontSize = NTypo().CAPTION
            letterSpacing = NSpacing().CAPTION
            fontWeight = FontWeight.Normal
        }
        TextType.OVERLINE.name -> {
            fontSize = NTypo().OVERLINE
            letterSpacing = NSpacing().OVERLINE
            fontWeight = FontWeight.Normal
        }
    }

    NDetailText(
        modifier = modifier,
        text = text,
        maxLines = maxLines,
        fontStyle = fontStyle,
        color = color,
        fontWeight = fontWeight,
        fontSize = fontSize,
        textAlign = textAlign,
        letterSpacing = letterSpacing,
        onTextLayout = onTextLayout
    )
}

@Composable
private fun NDetailText(
    modifier: Modifier,
    text: String?,
    color: Color,
    fontSize: TextUnit,
    fontStyle: FontStyle,
    fontWeight: FontWeight,
    textAlign: TextAlign,
    maxLines: Int,
    letterSpacing: TextUnit,
    onTextLayout: (TextLayoutResult) -> Unit,
) {
    Text(
        modifier = modifier,
        text = text ?: "",
        color = color,
        fontSize = fontSize,
        fontStyle = fontStyle,
        fontWeight = fontWeight,
        textAlign = textAlign,
        maxLines = maxLines,
        letterSpacing = letterSpacing,
        onTextLayout = onTextLayout
    )
}

enum class TextType {
    HEADLINE1, HEADLINE2, HEADLINE3, HEADLINE4, HEADLINE5, HEADLINE6, BODY, BODY2, BUTTON, CAPTION, OVERLINE, SUBTITLE, SUBTITLE2
}
