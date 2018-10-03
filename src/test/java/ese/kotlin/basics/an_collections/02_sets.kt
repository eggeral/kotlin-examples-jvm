package ese.kotlin.basics.an_collections

import kotlin.test.*

class _02_sets {

    @Test
    fun `Kotlin has mutable sets`() {
        val flights = mutableSetOf("LH1023", "OS402")
        assertTrue(flights.contains("LH1023"))

        flights.add("LH9999")
        assertEquals(3, flights.size)
        assertTrue(flights.contains("LH9999"))

        flights.remove("OS402")
        assertFalse { flights.contains("OS402") }

    }

    @Test
    fun `Kotlin has immutable sets`() {

        var flights = setOf("LH1023", "OS402")
        assertTrue(flights.contains("LH1023"))

        flights += "LH9999"
        assertEquals(3, flights.size)
        assertTrue(flights.contains("LH9999"))

        flights -= "OS402"
        assertFalse { flights.contains("OS402") }
        assertEquals(2, flights.size)
    }

}