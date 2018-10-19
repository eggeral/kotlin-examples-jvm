package ese.kotlin.basics.ap_gol

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class CellSpec {

    @Test
    fun aCellShouldHaveAPositionAndAnAliveState() {
        //given
        val position = Position2D(10, 10)

        //when
        val cell = Cell(position, true)

        //then
        assertEquals(Position2D(10, 10), cell.position)
        assertTrue(cell.alive)
    }

}
