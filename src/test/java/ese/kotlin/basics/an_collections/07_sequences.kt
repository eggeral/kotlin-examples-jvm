package ese.kotlin.basics.an_collections

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class _07_sequences {

    @Test
    fun `sequences provide lacy evaluation of collection operations`() {

        var numbers = listOf(10, 20, 30, 50).asSequence()

        numbers = numbers.filter { x -> x > 10 }.filter { x -> x < 50 }

        assertEquals(listOf(20, 30), numbers.toList())
        assertEquals(2, numbers.count())


        // showing lacy evaluation
        numbers = listOf(10, 20, 30, 50).asSequence()

        val processed = mutableListOf<Int>()
        numbers = numbers.filter { processed.add(it); true } // avoid side effects in real world!!!

        assertEquals(mutableListOf(), processed)
        numbers.count()
        assertEquals(mutableListOf(10, 20, 30, 50), processed)

        // same for a list (immediate evaluation)
        var numbersList = listOf(10, 20, 30, 50)

        val processedByListFilter = mutableListOf<Int>()
        numbersList = numbersList.filter { processedByListFilter.add(it); true } // avoid side effects in real world!!!

        assertEquals(mutableListOf(10, 20, 30, 50), processedByListFilter)
        numbersList.count()
        assertEquals(mutableListOf(10, 20, 30, 50), processedByListFilter)

    }

    @Test
    fun `sequences can be generated by a function`() {

        var numbers = generateSequence(1) { prev -> prev + 1 }

        numbers = numbers.drop(5).take(3)

        assertEquals(listOf(6, 7, 8), numbers.toList())
        assertEquals(3, numbers.count())

        val fibonacci = generateSequence(Pair(0, 1)) { Pair(it.second, it.first + it.second) }.map { it.first }
        assertEquals(listOf(0, 1, 1, 2, 3, 5, 8), fibonacci.take(7).toList())

    }

    @Test
    fun `sequences automatically stop at null`() {

        val numbers = generateSequence(1) { prev -> if (prev > 3) null else prev + 1 }

        assertEquals(listOf(1, 2, 3, 4), numbers.toList())
        assertEquals(4, numbers.count())

        val fibonacci = generateSequence(Pair(0, 1)) { Pair(it.second, it.first + it.second) }.map { it.first }
        assertEquals(listOf(0, 1, 1, 2, 3, 5, 8), fibonacci.take(7).toList())

    }

    @Test
    fun `generated sequences should try to avoid external state`() {

        var count = 3

        // Most sequence implementations can be iterated multiple times but
        // some sequence implementations can only be iterated once!
        val numbers = generateSequence {
            (count--).takeIf { it > 0 } // will return null, when value becomes non-positive,
            // and that will terminate the sequence
        }

        assertEquals(listOf(3, 2, 1), numbers.toList())
        assertFailsWith<IllegalStateException> { numbers.toList() }

    }
}
