package mx.edu.itson.practicanavigationcompose_miramontesdaniel.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import mx.edu.itson.practicanavigationcompose_miramontesdaniel.model.sampleCars
import mx.edu.itson.practicanavigationcompose_miramontesdaniel.ui.screens.CarDetailScreen
import mx.edu.itson.practicanavigationcompose_miramontesdaniel.ui.screens.CarsScreen
import mx.edu.itson.practicanavigationcompose_miramontesdaniel.ui.screens.LoginScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.LOGIN_SCREEN) {

        composable(
            route = Routes.LOGIN_SCREEN) {
            LoginScreen(onLogginSuccess = {
                navController.navigate(Routes.CARS_SCREEN)
            })
        }

        composable(
            route = Routes.CARS_SCREEN) {
            CarsScreen(
                onCarClick = { id -> navController.navigate("details/$id")},
                onLogout = { navController.popBackStack() })
        }

        composable(
            route = Routes.DETAILS_SCREEN,
            arguments = listOf(navArgument("carId") { type = NavType.IntType })
        ) { backStackEntry ->
            val carId = backStackEntry.arguments?.getInt("carId")
            val car = sampleCars.find { it.id == carId }

            if (car != null) {
                CarDetailScreen(car = car, onBack = { navController.popBackStack() })
            }
        }
    }
}

object Routes {
    const val LOGIN_SCREEN = "login"
    const val CARS_SCREEN = "list"
    const val DETAILS_SCREEN = "details/{carId}"
}

