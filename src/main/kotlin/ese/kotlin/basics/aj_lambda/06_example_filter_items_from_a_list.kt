package ese.kotlin.basics.aj_lambda

fun main(args: Array<String>) {
    val flights = arrayOf("OS201", "OS202", "LH4532", "4U234")
    println(flights.contentToString())

    // Filter the flights.
    val auaFlights = filter(flights) { flight -> flight.startsWith("OS") }
    println(auaFlights)

    val lufthansaFlights = filter(flights) { flight -> flight.startsWith("LH") }
    println(lufthansaFlights)

    // now we can even define totally different queries and still keep the basic method

    val allFlightNumberLargerThan222 = filter(flights) { flight -> Integer.parseInt(flight.substring(2)) > 222 }
    println(allFlightNumberLargerThan222)

}

fun filter(flights: Array<String>, predicate: (String) -> Boolean): Array<String?> {
    val auaFlights = arrayOfNulls<String>(flights.size)
    for ((idx, flight) in flights.withIndex()) {
        if (predicate(flight))
            auaFlights[idx] = flight
    }
    return auaFlights
}

