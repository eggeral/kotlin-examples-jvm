package ese.kotlin.basics.aj_lambda

import java.io.FileWriter

// We want to do something with a prefix and a suffix put with something unknown in between.
fun main(args: Array<String>) {
    class Flight(var id: String, var from: String, var to: String)

    val flights = arrayOf(Flight("OS201", "GRZ", "DUS"), Flight("OS202", "DUS", "GRZ"))

    FileWriter("flights.dat").use { fileWriter ->
        fileWriter.write("This is a dat file\n")
        fileWriter.write("Flight,From,To\n")
        for (flight in flights) {
            fileWriter.write(flight.id + "," + flight.from + "," + flight.to + "\n")
        }
        fileWriter.write("End of transmission\n")
    }

    val x = 10
    FileWriter("calculations.dat").use { fileWriter ->
        fileWriter.write("This is a dat file\n")
        fileWriter.write("x*2=" + x * 2 + "\n")
        fileWriter.write("x/2=" + x / 2 + "\n")
        fileWriter.write("End of transmission\n")
    }
}

