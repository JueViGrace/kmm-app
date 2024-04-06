package core.presentation

import androidx.compose.runtime.Composable

@Composable
expect fun KmmAppTheme(
    darkTheme: Boolean,
    dynamicColor: Boolean,
    content: @Composable () -> Unit
)