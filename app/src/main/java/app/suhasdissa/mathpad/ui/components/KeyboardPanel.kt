package app.suhasdissa.mathpad.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import app.suhasdissa.mathpad.backend.keymap.KeyMap

@Composable
fun KeyboardPanel(onKeyPress: (String) -> Unit, modifier: Modifier = Modifier) {
    val scrollState = rememberScrollState()
    Column(modifier = modifier.verticalScroll(scrollState)) {
        KeyRow(title = "Numbers :", items = KeyMap.numbers, onKeyPress)
        KeyRow(title = "Fractions :", items = KeyMap.fractions, onKeyPress)
        KeyRow(title = "Simple Math :", items = KeyMap.simpleMath, onKeyPress)
        KeyRow(title = "Common Symbols :", items = KeyMap.scienceSymbols, onKeyPress)
        KeyRow(title = "SuperScript :", items = KeyMap.superscriptNumbers, onKeyPress)
        KeyRow(title = "SubScript :", items = KeyMap.subscriptNumbers, onKeyPress)
        KeyRow(title = "English Uppercase :", items = KeyMap.englishUppercaseLetters, onKeyPress)
        KeyRow(title = "English Lowercase :", items = KeyMap.englishLowercaseLetters, onKeyPress)
        KeyRow(title = "Greek Uppercase :", items = KeyMap.greekUppercaseLetters, onKeyPress)
        KeyRow(title = "Greek Lowercase :", items = KeyMap.greekLowercaseLetters, onKeyPress)
        KeyRow(title = "Arrows :", items = KeyMap.arrows, onKeyPress)
    }
}
