package ese.kotlin.basics.an_collections

import kotlin.test.Test
import kotlin.test.assertEquals

class _04_collections_extensions {

    @Test
    fun `Kotlin provides extensive operations on collections`() {

        var numbers = listOf(10, 20, 30, 50)

        numbers = numbers.filter { x -> x > 10 }.filter { x -> x < 50 }

        assertEquals(listOf(20, 30), numbers)
        assertEquals(2, numbers.count()) // this is different from size!

        val strings = numbers.map { it.toString() }
        assertEquals(listOf("20", "30"), strings)

        assertEquals(listOf(1, 2, 3), listOf(1, 2, 3, 4, 5).take(3))
        assertEquals(3, listOf(1, 2, 3, 4, 5).find { it == 3 })

        var sum = 0
        listOf(1, 2, 3).forEach { sum += it }
        assertEquals(6, sum)

        assertEquals(6, listOf(1, 2, 3).sum())
        assertEquals(2.0, listOf(1, 2, 3).average())

    }
}
