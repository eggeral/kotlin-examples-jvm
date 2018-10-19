package ese.kotlin.basics.an_collections

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse

class _01_lists {

    @Test
    fun `Kotlin has mutable lists`() {
        val flights = mutableListOf("LH1023", "OS402")
        assertEquals("LH1023", flights[0])

        flights.add("LH9999")
        assertEquals(3, flights.size)
        assertEquals("LH9999", flights[2])

        flights[0] = "LH2013"
        assertEquals("LH2013", flights[0])

        flights.remove("OS402")
        assertFalse { flights.contains("OS402") }

        flights.removeAt(0)
        assertEquals(1, flights.size)
        assertEquals("LH9999", flights[0])

    }

    @Test
    fun `Kotlin has immutable lists`() {

        var flights = listOf("LH1023", "OS402")

        assertEquals("LH1023", flights[0])
        // flights.add("LH1023") does not work for immutable lists

        flights += "LH9999"
        assertEquals(3, flights.size)
        assertEquals("LH9999", flights[2])

        // flights[0] = "LH2013" does not work for immutable lists
        flights -= "OS402"
        assertFalse { flights.contains("OS402") }
        assertEquals(2, flights.size)
    }

}