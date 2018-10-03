package ese.kotlin.basics.am_extenstion_and_infix_functions

import kotlin.test.Test
import kotlin.test.assertEquals

class _01_extension_functions {

    @Test
    fun `Extension functions add functions to existing classes`() {

        data class Flight(val carrier: String, val number: Int)

        fun String.toFlight(): Flight {
            val carrier = this.substring(0..1)
            val number = this.substring(2).toInt()
            return Flight(carrier, number)
        }

        assertEquals(Flight("LH", 1234), "LH1234".toFlight())

    }


}