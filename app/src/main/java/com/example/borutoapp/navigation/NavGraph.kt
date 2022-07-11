package com.example.borutoapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.borutoapp.presentation.screen.splash.SplashScreen
import com.example.borutoapp.util.constants.DETAILS_ARGUMENTS_KEY

@Composable
fun setUpNavGraph(navController: NavHostController) {
    NavHost(navController = navController,
    startDestination = Screen.Splash.route
    ) {
        composable(route = Screen.Splash.route) {
            SplashScreen(navController = navController)
        }
        composable(route = Screen.Welcome.route) {

        }
        composable(route = Screen.Home.route) {

        }
        composable(
            route = Screen.Details.route,
            arguments = listOf(navArgument(DETAILS_ARGUMENTS_KEY) {
            type = NavType.IntType
            })
        ) {

        }
        composable(route = Screen.Search.route) {

        }
    }
}