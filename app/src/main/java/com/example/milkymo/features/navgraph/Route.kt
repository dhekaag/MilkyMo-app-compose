package com.example.milkymo.features.navgraph

sealed class Route(
    val route: String
){
    object LoginScreen: Route(route = "loginScreen")
    object ForgetIdScreen: Route(route = "forgetIdScreen")
    object ShowForgetIdScreen: Route(route = "showForgetIdScreen")
    object HomeScreen: Route(route = "homeScreen")
    object AppStartNavigation: Route(route = "appStartNavigation")
    object MilkyMoNavigation: Route(route = "milkyMoNavigation")
    object MilkyMoNavigatorScreen: Route(route = "milkyMoNavigator")
}
