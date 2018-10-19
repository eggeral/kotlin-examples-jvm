package ese.kotlin.basics.aj_lambda

import java.io.FileWriter
import java.io.Writer

fun main(args: Array<String>) {
    class Flight(var id: String, var from: String, var to: String)

    val flights = arrayOf(Flight("OS201", "GRZ", "DUS"), Flight("OS202", "DUS", "GRZ"))

    writeToDatFile("flights2.dat") { writer ->
        writer.write("Flight,From,To\n")
        for (flight in flights) {
            writer.write(flight.id + "," + flight.from + "," + flight.to + "\n")
        }
    }

    val x = 10
    writeToDatFile("calculations2.dat") { writer ->
        writer.write("x*2=" + x * 2 + "\n")
        writer.write("x/2=" + x / 2 + "\n")
    }

}


fun writeToDatFile(filename: String, consumer: (Writer) -> Unit) {
    FileWriter(filename).use { fileWriter ->
        fileWriter.write("This is a dat file\n")
        consumer(fileWriter)
        fileWriter.write("End of transmission\n")
    }
}
