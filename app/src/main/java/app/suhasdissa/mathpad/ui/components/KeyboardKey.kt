package app.suhasdissa.mathpad.ui.components

import android.view.SoundEffectConstants
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.unit.dp

@Composable
fun KeyboardKey(
    keyboardKey: String,
    onClick: () -> Unit
) {
    val view = LocalView.current
    Box(
        modifier = Modifier
            .clip(shape = RoundedCornerShape(8.dp))
            .background(MaterialTheme.colorScheme.primaryContainer)
            .size(48.dp)
            .clickable {
                onClick()
                view.playSoundEffect(SoundEffectConstants.CLICK)
            },
        contentAlignment = Alignment.Center
    ) {
        Text(
            keyboardKey,
            Modifier
                .padding(4.dp),
            style = MaterialTheme.typography.headlineSmall

        )
    }
}

@Composable
fun KeyboardSpecialKey(
    modifier: Modifier = Modifier.clip(shape = RoundedCornerShape(16.dp)).size(48.dp),
    keyboardKey: String,
    onClick: () -> Unit,
    icon: ImageVector? = null
) {
    val view = LocalView.current
    Box(
        modifier = modifier
            .background(MaterialTheme.colorScheme.secondaryContainer)
            .clickable {
                onClick()
                view.playSoundEffect(SoundEffectConstants.CLICK)
            },
        contentAlignment = Alignment.Center
    ) {
        if (icon != null) {
            Icon(imageVector = icon, contentDescription = keyboardKey)
        } else {
            Text(
                keyboardKey,
                Modifier
                    .padding(4.dp),
                style = MaterialTheme.typography.headlineSmall
            )
        }
    }
}
