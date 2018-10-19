package ese.kotlin.basics.aq_objects

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class _01_kotlin_objects {

    @Test
    fun `Kotlin supports the declaration of standalone objects`() {
        val flight = object {
            val airline = "OS"
            val number = "1234"
            fun flightNumber(): String {
                return "$airline$number"
            }
        }

        assertEquals("OS1234", flight.flightNumber())
    }

    class Flight(val flightNumber: String) {
        companion object {
            val airlines = listOf("OS", "LH", "WZ")
        }
    }

    @Test
    fun `Companion objects provide similar semantics like static Java methods`() {
        assertEquals(listOf("OS", "LH", "WZ"), Flight.airlines)
    }

    interface MouseListener {
        fun onClick()
        fun onEnter()
    }

    @Test
    fun `Objects can be used instead of Java anonymous classes`() {


        class Button(val name: String) {

            private val mouseListeners = mutableListOf<MouseListener>()

            fun addMouseListener(mouseListener: MouseListener) {
                mouseListeners.add(mouseListener)
            }

            fun click() {
                mouseListeners.forEach { it.onClick() }
            }
        }

        val myButton = Button("Click me!")
        var clicked = false
        var entered = false
        myButton.addMouseListener(object : MouseListener {
            override fun onClick() {
                clicked = true
            }

            override fun onEnter() {
                entered = true
            }

        })

        myButton.click()

        assertTrue(clicked)
        assertFalse(entered)
    }

}
