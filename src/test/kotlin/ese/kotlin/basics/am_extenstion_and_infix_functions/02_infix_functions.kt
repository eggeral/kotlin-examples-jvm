package ese.kotlin.basics.am_extenstion_and_infix_functions

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class _02_infix_functions {

    @Test
    fun `functions can be defined and used as infix`() {

        infix fun String.containsInt(int: Int): Boolean {
            val intStr = int.toString()
            return this.contains(intStr)
        }

        assertTrue("abs123efg" containsInt 123)
        assertFalse("abs123efg" containsInt 9)

    }


}