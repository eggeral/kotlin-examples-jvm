package ese.kotlin.basics.aj_lambda

fun main(args: Array<String>) {
    val flights = arrayOf("OS201", "OS202", "LH4532", "4U234")
    println(flights.contentToString())

    // Filter the flights.
    var filtered = allAuaFlights(flights)
    println(filtered.contentToString())

    filtered = allLufthansaFlights(flights)
    println(filtered.contentToString())

    // In order not to have duplicate code you might add the prefix as a parameter,
    // but there is an even better way.

}

fun allAuaFlights(flights: Array<String>): Array<String?> {
    val auaFlights = arrayOfNulls<String>(flights.size)
    for ((idx, flight) in flights.withIndex()) {
        if (flight.startsWith("OS"))
            auaFlights[idx] = flight
    }
    return auaFlights
}

fun allLufthansaFlights(flights: Array<String>): Array<String?> {
    val lhFlights = arrayOfNulls<String>(flights.size)
    for ((idx, flight) in flights.withIndex()) {
        if (flight.startsWith("LH"))
            lhFlights[idx] = flight
    }
    return lhFlights
}

