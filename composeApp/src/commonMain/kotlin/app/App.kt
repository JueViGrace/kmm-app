package app

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import app.components.MainApp
import core.presentation.KmmAppTheme
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalResourceApi::class)
@Composable
@Preview
fun App(
    darkTheme: Boolean,
    dynamicColor: Boolean = false
) {
    KmmAppTheme(
        darkTheme,
        dynamicColor
    ) {
        Surface(
            modifier = Modifier.fillMaxSize(),
        ) {
            MainApp()
        }
    }
}
