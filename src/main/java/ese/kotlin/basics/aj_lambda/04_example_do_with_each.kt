package ese.kotlin.basics.aj_lambda

fun main(args: Array<String>) {
    val flights = arrayOf("OS201", "OS202", "LH4532", "4U234")
    doWithEach(flights, { flight -> println(flight) })

    // alternative syntax
    doWithEach(flights, { println(it) })
    doWithEach(flights) { println(it) }
    doWithEach(flights, System.out::println)

    println("---")
    doWithEach(flights, { flight -> println(flight.substring(0, 2)) })
}

fun doWithEach(flights: Array<String>, consumer: (flight: String) -> Unit) {
    for (flight in flights) {
        consumer(flight)
    }
}
