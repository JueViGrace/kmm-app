package core.presentation

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import app.theme.DarkColorScheme
import app.theme.LightColorScheme

@Composable
actual fun KmmAppTheme(
    darkTheme: Boolean,
    dynamicColor: Boolean,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        content = content
    )
}
