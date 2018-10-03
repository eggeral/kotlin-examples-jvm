package ese.kotlin.basics.an_collections

import kotlin.test.*

class _03_maps {

    @Test
    fun `Kotlin has mutable maps`() {

        val flights = mutableMapOf("ID1" to "LH1023", "ID2" to "OS402")
        assertEquals("OS402", flights["ID2"])
        assertEquals(mutableSetOf("ID1", "ID2"), flights.keys)
        assertEquals(listOf("LH1023", "OS402"), flights.values.toList())

        flights["ID3"] = ("LH9999")
        assertEquals(3, flights.size)
        assertTrue(flights.containsValue("LH9999"))
        assertTrue(flights.containsKey("ID3"))

        flights.remove("ID2")
        assertFalse { flights.containsValue("OS402") }

    }

    @Test
    fun `Kotlin has immutable maps`() {

        var flights = mapOf("ID1" to "LH1023", "ID2" to "OS402")
        assertEquals("OS402", flights["ID2"])
        assertEquals(setOf("ID1", "ID2"), flights.keys)
        assertEquals(listOf("LH1023", "OS402"), flights.values.toList())

        flights += "ID3" to "LH9999"
        assertEquals(3, flights.size)
        assertTrue(flights.containsValue("LH9999"))
        assertTrue(flights.containsKey("ID3"))

        flights -= "ID2"
        assertFalse { flights.containsValue("OS402") }
    }

}