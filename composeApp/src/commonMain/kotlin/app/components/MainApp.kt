package app.components

import androidx.compose.runtime.Composable
import app.navigation.AppScreen
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.transitions.SlideTransition
import core.navigation.NavigationModules

@Composable
fun MainApp() {
    Navigator(
        screen = AppScreen(
            initialScreen = NavigationModules.Auth.screen
        )
    ) { navigator ->
        SlideTransition(navigator)
    }
}
