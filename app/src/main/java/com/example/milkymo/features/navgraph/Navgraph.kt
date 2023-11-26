package com.example.milkymo.features.navgraph

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation
import com.example.milkymo.features.authentication.login.LoginScreen
import com.example.milkymo.features.authentication.login.LoginViewModel
import com.example.milkymo.features.home.HomeScreen

@Composable
fun NavGraph(
    startDestination: String
) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = startDestination){
        navigation(
            route = Route.AppStartNavigation.route,
            startDestination = Route.LoginScreen.route
        ){
            composable(
                route = Route.LoginScreen.route
            ){
                val viewModel: LoginViewModel = hiltViewModel()
                LoginScreen(onEvent = viewModel::onEvent)
            }
        }
        navigation(
            route = Route.MilkyMoNavigation.route,
            startDestination = Route.MilkyMoNavigatorScreen.route
        ) {
            composable(route = Route.HomeScreen.route) {
                HomeScreen()
            }
//            composable(route = ) {
//
//            }
//            composable(route = ) {
//
//            }
//            composable(route = ) {
//
//            }
        }
    }
}