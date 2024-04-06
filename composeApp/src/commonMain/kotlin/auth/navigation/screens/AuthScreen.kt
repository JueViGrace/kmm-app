package auth.navigation.screens

import androidx.compose.runtime.Composable
import auth.navigation.routes.AuthScreens
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.core.screen.ScreenKey
import cafe.adriel.voyager.core.screen.uniqueScreenKey
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.transitions.SlideTransition

object AuthScreen : Screen {
    override val key: ScreenKey = uniqueScreenKey

    @Composable
    override fun Content() {
        Navigator(
            screen = AuthScreens.Login.screen
        ) { navigator ->
            SlideTransition(navigator)
        }
    }
}
