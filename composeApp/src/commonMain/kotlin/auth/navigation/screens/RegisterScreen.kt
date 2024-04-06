package auth.navigation.screens

import androidx.compose.runtime.Composable
import app.navigation.AppScreen
import auth.navigation.routes.AuthScreens
import auth.register.presentation.ui.RegisterContent
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.core.screen.ScreenKey
import cafe.adriel.voyager.core.screen.uniqueScreenKey
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import core.navigation.NavigationModules

object RegisterScreen : Screen {
    override val key: ScreenKey = uniqueScreenKey

    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow

        RegisterContent(
            navigateToLogin = {
                navigator.takeIf { it.canPop }?.let { nav ->
                    run {
                        nav.pop()
                    }
                }
            },
            navigateToTerms = {
                navigator.push(AuthScreens.Terms.screen)
            },
            navigateToHome = {
                navigator.replaceAll(AppScreen(initialScreen = NavigationModules.Home.screen))
            }
        )
    }
}
