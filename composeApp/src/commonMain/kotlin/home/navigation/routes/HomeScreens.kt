package home.navigation.routes

import cafe.adriel.voyager.core.screen.Screen
import home.navigation.tabs.DashboardTab
import home.navigation.tabs.ProductsTab
import home.navigation.tabs.ProfileTab

sealed class HomeScreens(val screen: Screen) {
    data object DashBoard : HomeScreens(
        screen = DashboardTab
    )
    data object Products : HomeScreens(
        screen = ProductsTab
    )
    data object Profile : HomeScreens(
        screen = ProfileTab
    )
}
