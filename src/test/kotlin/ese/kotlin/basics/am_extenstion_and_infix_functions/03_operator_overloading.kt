package ese.kotlin.basics.am_extenstion_and_infix_functions

import kotlin.test.Test
import kotlin.test.assertEquals

class _03_operator_overloading {

    @Test
    fun `operators can be defined by implementing methods`() {

        data class Passenger(val name: String)

        class Flight {
            val passengers = mutableListOf<Passenger>()

            operator fun plusAssign(passenger: Passenger) {
                passengers.add(passenger)
            }
        }

        val flight = Flight()
        flight.plusAssign(Passenger("Max Muster"))
        flight += Passenger("Test User")

        assertEquals(2, flight.passengers.size)

        operator fun Flight.plusAssign(name:String) {
            this.plusAssign(Passenger(name))
        }

        flight += "Another Passenger"

    }


}