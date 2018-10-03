package ese.kotlin.basics.ao_java_interop

import kotlin.test.*

class _01_call_java_from_kotlin {

    @Test
    fun `Java classes can be used in Kotlin as they are`() {

        val list = ArrayList<Int>() // Java Array List

        for (item in 1..3) {
            list.add(item)
        }

        assertEquals(listOf(1, 2, 3), list) // comparing a Kotlin list to a Java list

    }

    @Test
    fun `Getters and setters are represented as Kotlin properties`() {

        val flight = JavaFlight()

        flight.setNumber("OS1234") // still works
        flight.setOnTime(false) // still works

        assertEquals("OS1234", flight.getNumber()) // get still works
        assertFalse(flight.isOnTime()) // is still works

        // its better to use the Kotlin way

        flight.number = "LH1998"
        flight.isOnTime = true

        assertEquals("LH1998", flight.number)
        assertTrue(flight.isOnTime) // is still is called is.... put can be used without ()

    }

    @Test
    fun `Method returning void return Unit in Kotlin`() {

        val flight = JavaFlight()

        flight.number = "OS1234"
        val setOnTimeReturnValue = flight.setOnTime(false)

        assertTrue(setOnTimeReturnValue is Unit)

    }

    @Test
    fun `Null-check safety for Java types is the same as in Java`() {

        val javaFLightDb = JavaFlightDb()

        javaFLightDb.addFlightNumber(null)
        javaFLightDb.addFlightNumber("1234")

        assertTrue(javaFLightDb.flightNumbers.size is Int) // Null checks are carried out for primitive types as they can not be null
        assertNull(javaFLightDb.flightNumbers[0]) // Should be String? in Kotlin but as we get it from the Java world no null check is made.
        assertEquals("1234", javaFLightDb.flightNumbers[1])

        fun formatFlightNumber(number: String): String { // Kotlin would not allow nulls here
            return "${number.length}--$number--"
        }

        // formatFlightNumber(null) // does not work!
        assertEquals("4--1234--", formatFlightNumber(javaFLightDb.flightNumbers[1]))
        assertFailsWith<IllegalStateException> { formatFlightNumber(javaFLightDb.flightNumbers[0]) } // this is null but Kotlin does not check it!

    }

    @Test
    fun `Java methods or fields which have the same name as a Kotlin keyword can be escaped`() {

        val kotlinKeywords = KotlinKeywords()

        kotlinKeywords.`is` = 10
        kotlinKeywords.`object`()

    }


}