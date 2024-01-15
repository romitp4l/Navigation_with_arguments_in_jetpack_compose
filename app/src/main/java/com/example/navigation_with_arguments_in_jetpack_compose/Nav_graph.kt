package com.example.navigation_with_arguments_in_jetpack_compose

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.Navigation
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument


@Composable
fun Navigation() {

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "LoginScreen") {

        composable(route = "LoginScreen") {
            LoginScreen(navController)
        }

        composable(route = "Dashboard/{emailValue}/{passwordValue}",
            arguments = listOf(
                navArgument("emailValue") {
                    type = NavType.StringType

                },
                navArgument("passwordValue") {
                    type = NavType.StringType

                }
            )

        ) { backStackEntry ->
            Dashboard(
                emailValue = backStackEntry.arguments?.getString("emailValue"),
                passwordValue = backStackEntry.arguments?.getString("passwordValue"),
                naveController = navController
            )
        }
    }

}