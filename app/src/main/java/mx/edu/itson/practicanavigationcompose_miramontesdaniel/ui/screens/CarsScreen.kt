package mx.edu.itson.practicanavigationcompose_miramontesdaniel.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import mx.edu.itson.practicanavigationcompose_miramontesdaniel.model.sampleCars
import mx.edu.itson.practicanavigationcompose_miramontesdaniel.ui.components.CarCard

@Composable
fun CarsScreen(onCarClick: (Int) -> Unit, onLogout: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ) {
            TextButton(onClick = onLogout) {
                Text("Cerrar Sesión >")
            }
        }

        Text(text = "Listado de vehículos",
            style = MaterialTheme.typography.headlineLarge,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )
        LazyColumn {
            items(items = sampleCars) { car ->
                CarCard(car = car, onClick = { onCarClick(car.id) })
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CarsScreenPreview() {
    // CarsScreen()
}