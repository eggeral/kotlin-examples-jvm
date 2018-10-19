package ese.kotlin.basics.aj_lambda

fun main(args: Array<String>) {
    val flights = arrayOf("OS201", "OS202", "LH4532", "4U234", "LH3456")
    doWithEachIndexed(flights) { index, flight -> println("$index: $flight") }

    println("---")
    doWithEachIndexed(flights) { index, flight ->
        print(flight)
        if ((index + 1) % 2 == 0)
            println()
        else
            print(", ")
    }
}

fun doWithEachIndexed(flights: Array<String>, consumer: (Int, String) -> Unit) {
    for (index in flights.indices) {
        consumer(index, flights[index])
    }
}
