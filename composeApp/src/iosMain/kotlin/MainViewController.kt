import androidx.compose.ui.window.ComposeUIViewController

fun MainViewController() = ComposeUIViewController {
    App(
        darkTheme = isSystemInDarkTheme(),
        dynamicColor = false,
    )
}