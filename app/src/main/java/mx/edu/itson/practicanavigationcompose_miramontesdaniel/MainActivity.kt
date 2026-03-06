package mx.edu.itson.practicanavigationcompose_miramontesdaniel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import mx.edu.itson.practicanavigationcompose_miramontesdaniel.navigation.AppNavigator
import mx.edu.itson.practicanavigationcompose_miramontesdaniel.ui.theme.PracticaNavigationCompose_MiramontesDanielTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PracticaNavigationCompose_MiramontesDanielTheme {
                AppNavigator()
            }
        }
    }
}