package mx.edu.itson.practicanavigationcompose_miramontesdaniel.model

import mx.edu.itson.practicanavigationcompose_miramontesdaniel.R

data class Car(
    val id: Int,
    val brand: String,
    val model: String,
    val year: Int,
    val specs: String,
    val imageRes: Int = 0
)

val sampleCars = listOf(
    Car(id = 1, brand = "Ferrari", model = "F40", year = 1987, specs = "V8 Biturbo, 2.9L, 478 CV", imageRes = R.drawable.ferrarif40),
    Car(id = 2, brand = "Toyota", model = "Supra MK4", year = 1993, specs = "L6, 3.0L, 320 CV (2JZ-GTE)", imageRes = R.drawable.supramk4),
    Car(id = 3, brand = "Nissan", model = "Skyline GT-R R34", year = 1999, specs = "L6, 2.6L, 280 CV (RB26DETT)", imageRes = R.drawable.nissanr34),
    Car(id = 4, brand = "Ford", model = "Mustang Shelby GT500", year = 1967, specs = "V8, 7.0L, 355 CV", imageRes = R.drawable.shelbygt500),
    Car(id = 5, brand = "Porsche", model = "911 Turbo (930)", year = 1975, specs = "B6 Turbo, 3.3L, 300 CV", imageRes = R.drawable.porsche911),
    Car(id = 6, brand = "Lamborghini", model = "Countach LP5000", year = 1985, specs = "V12, 5.2L, 455 CV", imageRes = R.drawable.countachlp5000),
    Car(id = 7, brand = "Chevrolet", model = "Camaro SS", year = 1969, specs = "V8, 6.5L, 375 CV", imageRes = R.drawable.camaross),
    Car(id = 8, brand = "BMW", model = "M3 GTR E46", year = 2001, specs = "V8, 4.0L, 444 CV", imageRes = R.drawable.bmwm3gtr),
    Car(id = 9, brand = "Mazda", model = "RX-7 FD", year = 1992, specs = "Rotativo (2 rotores), 1.3L, 255 CV", imageRes = R.drawable.rx7fd),
    Car(id = 10, brand = "DeLorean", model = "DMC-12", year = 1981, specs = "V6, 2.8L, 130 CV", imageRes = R.drawable.deloreandmc12)
)