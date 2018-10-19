package ese.kotlin.basics.at_gol_grid_board

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class GolSpec {
    @Test
    fun aDeadCellWithExactlyThreeLivingNeighboursShouldBeAliveInTheNextGeneration() {
        //given
        val cell = Cell(false)
        cell.livingNeighbours = 3

        //when
        cell.calculateNextGeneration()

        //then
        assertTrue(cell.alive)
    }

    @Test
    fun aLivingCellWithLessThanTwoNeighboursShouldBeDeadInTheNextGeneration() {
        //given
        val cell = Cell(true)
        cell.livingNeighbours = 1

        //when
        cell.calculateNextGeneration()

        //then
        assertFalse(cell.alive)

    }

    @Test
    fun aLivingCellWithTwoNeighboursShouldBeAliveInTheNextGeneration() {
        //given
        val cell = Cell(true)
        cell.livingNeighbours = 2

        //when
        cell.calculateNextGeneration()

        //then
        assertTrue(cell.alive)
    }

    @Test
    fun aLivingCellWithThreeNeighboursShouldBeAliveInTheNextGeneration() {
        //given
        val cell = Cell(true)
        cell.livingNeighbours = 3

        //when
        cell.calculateNextGeneration()

        //then
        assertTrue(cell.alive)
    }

    @Test
    fun aLivingCellWithMoreThanThreeNeighboursShouldBeDeadInTheNextGeneration() {
        //given
        val cell = Cell(true)
        cell.livingNeighbours = 4

        //when
        cell.calculateNextGeneration()

        //then
        assertFalse(cell.alive)

    }

    @Test
    fun aDeadCellWithLessThanThreeLivingNeighboursShouldBeDead() {
        //given
        val cell = Cell(false)
        cell.livingNeighbours = 2

        //when
        cell.calculateNextGeneration()

        //then
        assertFalse(cell.alive)
    }

    @Test
    fun aGameCanCalculateTheNextGeneration() {
        //given
        val cells = arrayOf(
                arrayOf(Cell(false), Cell(true), Cell(false)),
                arrayOf(Cell(false), Cell(true), Cell(false)),
                arrayOf(Cell(false), Cell(true), Cell(false))
        )

        val game = Game(cells)

        //when
        game.calculateNextGeneration()

        //then
        assertFalse(cells[0][0].alive)
        assertFalse(cells[0][1].alive)
        assertFalse(cells[0][2].alive)
        assertTrue(cells[1][0].alive)
        assertTrue(cells[1][1].alive)
        assertTrue(cells[1][2].alive)
        assertFalse(cells[2][0].alive)
        assertFalse(cells[2][1].alive)
        assertFalse(cells[2][2].alive)
    }

    @Test
    fun theNumberOfLivingNeighboursOfACellCanBeCounted() {
        //given
        var cells = arrayOf(
                arrayOf(Cell(false), Cell(true), Cell(false)),
                arrayOf(Cell(false), Cell(true), Cell(false)),
                arrayOf(Cell(false), Cell(true), Cell(false))
        )

        // when / then
        assertEquals(2, cells.countLivingNeighbours(0, 0))
        assertEquals(1, cells.countLivingNeighbours(1, 0))
        assertEquals(2, cells.countLivingNeighbours(2, 0))

        assertEquals(3, cells.countLivingNeighbours(0, 1))
        assertEquals(2, cells.countLivingNeighbours(1, 1))
        assertEquals(3, cells.countLivingNeighbours(2, 1))

        assertEquals(2, cells.countLivingNeighbours(0, 2))
        assertEquals(1, cells.countLivingNeighbours(1, 2))
        assertEquals(2, cells.countLivingNeighbours(2, 2))

        //given
        cells = arrayOf(
                arrayOf(Cell(true), Cell(true), Cell(true)),
                arrayOf(Cell(true), Cell(true), Cell(true)),
                arrayOf(Cell(true), Cell(true), Cell(true))
        )

        // when / then
        assertEquals(8, cells.countLivingNeighbours(1, 1))

        //given
        cells = arrayOf(
                arrayOf(Cell(false), Cell(false), Cell(false)),
                arrayOf(Cell(false), Cell(false), Cell(false)),
                arrayOf(Cell(false), Cell(false), Cell(false))
        )

        // when / then
        assertEquals(0, cells.countLivingNeighbours(1, 1))

        //given
        cells = arrayOf(
                arrayOf(Cell(true), Cell(false), Cell(true)),
                arrayOf(Cell(false), Cell(false), Cell(false)),
                arrayOf(Cell(true), Cell(false), Cell(true))
        )

        // when / then
        assertEquals(4, cells.countLivingNeighbours(1, 1))

    }

}

