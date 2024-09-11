fun main() {
    val celToFah : (Double) -> Double = {
        (9.0 / 5.0) * it + 32
    }

    val kelTocel : (Double) -> Double = {
        it + 273.15
    }

    val fahToKel : (Double) -> Double = {
        (5.0 / 9.0) * (it -32) + 273/15
    }

    printFinalTemperature(27.0, "Celcius", "Fahrenheit", celToFah)
}


fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}