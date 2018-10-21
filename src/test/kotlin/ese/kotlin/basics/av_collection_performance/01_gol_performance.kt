package ese.kotlin.basics.av_collection_performance

import java.time.Duration
import java.time.Instant
import kotlin.test.Test

/*
Calculating the next generation of a GOL field

= Board: 100x100

== Java
Using ifs took: 4ms
Using for loop took: 2ms
Using Kotlin collections took: 31ms
Using Kotlin sequences took: 12ms
Using Java streams took: 39ms
Using ThinkAndVision series took: 81ms

== JavaScript (Chrome)
Using ifs took: 2ms
Using for loop took: 1ms
Using Kotlin collections took: 107ms
Using Kotlin sequences took: 77ms
Using ThinkAndVision series took: 221ms

== JavaScript (Safari)
Using ifs took: 2ms
Using for loop took: 2ms
Using Kotlin collections took: 756ms
Using Kotlin sequences took: 585ms
Using ThinkAndVision series took: 3325ms

= Board: 1000x1000

== Java
Using ifs took: 48ms
Using for loop took: 48ms
Using Kotlin collections took: 844ms
Using Kotlin sequences took: 682ms
Using Java streams took: 870ms
Using ThinkAndVision series took: 3286ms

== JavaScript (Chrome)
Using ifs took: 123ms
Using for loop took: 133ms
Using Kotlin collections took: 9176ms
Using Kotlin sequences took: 7404ms
Using ThinkAndVision series took: did not finish

== JavaScript (Safari)
Using ifs took: 123ms
Using for loop took: 133ms
Using Kotlin collections took: did not finish
Using Kotlin sequences took: did not finish
Using ThinkAndVision series took: 19413ms


 */

class GolPerformanceTest {

    @Test
    fun `Measure calculating the next GOL generation`() {

        measureTime("Using ifs") {
            board().calculateNextGeneration { column, row -> countLivingNeighboursUsingIfs(column, row) }
        }
        measureTime("Using for loop") {
            board().calculateNextGeneration { column, row -> countLivingNeighboursUsingForLoop(column, row) }
        }
        measureTime("Using Kotlin collections") {
            board().calculateNextGeneration { column, row -> countLivingNeighboursUsingKotlinCollectionExtensions(column, row) }
        }
        measureTime("Using Kotlin sequences") {
            board().calculateNextGeneration { column, row -> countLivingNeighboursUsingKotlinSequences(column, row) }
        }
        measureTime("Using Java streams") {
            board().calculateNextGeneration { column, row -> countLivingNeighboursUsingJavaStreams(column, row) }
        }

    }

    private val size = 10
    private val repeat = 1
    private fun board() = Array(size) { _ -> Array(size) { Cell(false) } }

    private fun measureTime(message: String, block:() -> Unit) {
        val start = Instant.now()
        (1..repeat).forEach { _ -> block() }
        println("$message took: ${Duration.between(start, Instant.now()).dividedBy(repeat.toLong()).toMillis()}ms")
    }

}

