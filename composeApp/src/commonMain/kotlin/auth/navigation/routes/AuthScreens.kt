package auth.navigation.routes

import auth.navigation.screens.LoginScreen
import auth.navigation.screens.RegisterScreen
import auth.navigation.screens.TermsScreen
import cafe.adriel.voyager.core.screen.Screen

sealed class AuthScreens(val screen: Screen) {
    data object Login : AuthScreens(
        screen = LoginScreen
    )
    data object Register : AuthScreens(
        screen = RegisterScreen
    )
    data object Terms : AuthScreens(
        screen = TermsScreen
    )
}
