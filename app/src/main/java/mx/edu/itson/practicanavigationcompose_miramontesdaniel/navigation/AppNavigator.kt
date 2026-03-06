package mx.edu.itson.practicanavigationcompose_miramontesdaniel.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import mx.edu.itson.practicanavigationcompose_miramontesdaniel.ui.screens.ListScreen
import mx.edu.itson.practicanavigationcompose_miramontesdaniel.ui.screens.LoginScreen

@Composable
fun AppNavigator() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "login") {
        composable(route = "login") {
            LoginScreen(onClick = {navController.navigate("list")})
        }

        composable(route = "list") {
            ListScreen(onClick = {navController.navigate("login")})
        }
    }
}

