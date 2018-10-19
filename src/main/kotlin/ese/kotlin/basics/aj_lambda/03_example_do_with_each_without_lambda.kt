package ese.kotlin.basics.aj_lambda

fun main(args: Array<String>) {
    val flights = arrayOf("OS201", "OS202", "LH4532", "4U234")
    printAllFlights(flights)

    println("---")
    printAllCarriers(flights)
}

fun printAllFlights(flights: Array<String>) {
    for (flight in flights) {
        println(flight)
    }
}

fun printAllCarriers(flights: Array<String>) {
    for (flight in flights) {
        println(flight.substring(0, 2))
    }
}

