package core.navigation

import auth.navigation.screens.AuthScreen
import cafe.adriel.voyager.core.screen.Screen
import home.navigation.screens.HomeScreen

sealed class NavigationModules(val screen: Screen) {
    data object Auth : NavigationModules(
        screen = AuthScreen
    )
    data object Home : NavigationModules(
        screen = HomeScreen
    )
}
