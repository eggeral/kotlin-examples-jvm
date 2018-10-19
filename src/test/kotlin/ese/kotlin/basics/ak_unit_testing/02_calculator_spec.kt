package ese.kotlin.basics.ak_unit_testing

import kotlin.test.Test
import kotlin.test.assertEquals

class CalculatorSpec {

    @Test
    fun aCalculatorIsAbleToSumUpTwoNumbers() {
        // given
        val calc = Calculator(1, 3)

        // when
        val sum = calc.sum()

        // then
        assertEquals(4, sum )
    }
}