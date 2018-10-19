package ese.kotlin.basics.ao_java_interop

class KotlinFlight(val number: String) {
    var isOnTime: Boolean = false
}

fun formatFlightNumber(flight: KotlinFlight) : String = "-- ${flight.number} --"