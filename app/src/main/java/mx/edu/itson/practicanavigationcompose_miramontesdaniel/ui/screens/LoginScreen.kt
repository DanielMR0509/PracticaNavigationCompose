package mx.edu.itson.practicanavigationcompose_miramontesdaniel.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun LoginScreen(onClick:() -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Text(text = "Pantalla de Inicio de Sesión")
        Button(onClick = { onClick() }) {
            Text("Ingresar a Listado")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen(onClick = {})
}