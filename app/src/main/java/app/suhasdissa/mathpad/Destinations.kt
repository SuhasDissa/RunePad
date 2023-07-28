package app.suhasdissa.mathpad

sealed class Destinations(val route: String) {
    object Home : Destinations("home")
    object Keypad : Destinations("keypad")
}
