package app.suhasdissa.mathpad

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import app.suhasdissa.mathpad.ui.screens.home.HomeScreen
import app.suhasdissa.mathpad.ui.screens.keypad.KeypadScreen

@Composable
fun AppNavHost(navHostController: NavHostController) {
    NavHost(
        navController = navHostController,
        startDestination = Destinations.Keypad.route
    ) {
        composable(route = Destinations.Home.route) {
            HomeScreen(onNavigate = { destination ->
                navHostController.navigateTo(destination.route)
            })
        }
        composable(route = Destinations.Keypad.route) {
            KeypadScreen()
        }
    }
}

fun NavHostController.navigateTo(route: String) = this.navigate(route) {
    launchSingleTop = true
    restoreState = true
}
