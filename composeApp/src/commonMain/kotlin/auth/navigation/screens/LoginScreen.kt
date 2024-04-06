package auth.navigation.screens

import androidx.compose.runtime.Composable
import app.navigation.AppScreen
import auth.login.presentation.ui.LoginContent
import auth.navigation.routes.AuthScreens
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.core.screen.ScreenKey
import cafe.adriel.voyager.core.screen.uniqueScreenKey
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import core.navigation.NavigationModules

object LoginScreen : Screen {
    override val key: ScreenKey = uniqueScreenKey

    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow

        LoginContent(
            navigateToRegister = {
                navigator.push(AuthScreens.Register.screen)
            },
            navigateToHome = {
                navigator.replaceAll(AppScreen(initialScreen = NavigationModules.Home.screen))
            }
        )
    }
}
