package ese.kotlin.basics.ap_gol

import kotlin.test.assertEquals
import kotlin.test.Test

class Position2DSpec {

    @Test
    fun aPosition2DCanCalculateTheDistanceToAnotherPosition2D() {
        assertEquals(0.0, Position2D(1, 1) distanceFrom Position2D(1, 1))
        assertEquals(1.0, Position2D(1, 1) distanceFrom Position2D(2, 1))
        assertEquals(1.4142135623730951, Position2D(1, 1) distanceFrom Position2D(2, 2))
        assertEquals(2.0, Position2D(1, 1) distanceFrom Position2D(3, 1))
        assertEquals(2.8284271247461903, Position2D(1, 1) distanceFrom Position2D(3, 3))

    }
}
