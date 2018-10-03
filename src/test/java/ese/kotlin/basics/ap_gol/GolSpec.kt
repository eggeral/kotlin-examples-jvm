package ese.kotlin.basics.ap_gol

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class GolSpec {
    @Test
    fun aDeadCellWithExactlyThreeLivingNeighboursShouldBeAliveInTheNextGeneration() {
        //given
        val cell = Cell(Position2D(0, 1), false)
        cell.livingNeighbours = 3

        //when
        cell.calculateNextGeneration()

        //then
        assertTrue(cell.alive)
    }

    @Test
    fun aLivingCellWithLessThanTwoNeighboursShouldBeDeadInTheNextGeneration() {
        //given
        val cell = Cell(Position2D(0, 1), true)
        cell.livingNeighbours = 1

        //when
        cell.calculateNextGeneration()

        //then
        assertFalse(cell.alive)

    }

    @Test
    fun aLivingCellWithTwoNeighboursShouldBeAliveInTheNextGeneration() {
        //given
        val cell = Cell(Position2D(0, 1), true)
        cell.livingNeighbours = 2

        //when
        cell.calculateNextGeneration()

        //then
        assertTrue(cell.alive)
    }

    @Test
    fun aLivingCellWithThreeNeighboursShouldBeAliveInTheNextGeneration() {
        //given
        val cell = Cell(Position2D(0, 1), true)
        cell.livingNeighbours = 3

        //when
        cell.calculateNextGeneration()

        //then
        assertTrue(cell.alive)
    }

    @Test
    fun aLivingCellWithMoreThanThreeNeighboursShouldBeDeadInTheNextGeneration() {
        //given
        val cell = Cell(Position2D(0, 1), true)
        cell.livingNeighbours = 4

        //when
        cell.calculateNextGeneration()

        //then
        assertFalse(cell.alive)

    }

    @Test
    fun aDeadCellWithLessThanThreeLivingNeighboursShouldBeDead() {
        //given
        val cell = Cell(Position2D(0, 1), false)
        cell.livingNeighbours = 2

        //when
        cell.calculateNextGeneration()

        //then
        assertFalse(cell.alive)
    }

    @Test
    fun aGameCanCalculateTheNextGeneration() {
        //given

        val cells = listOf(
                Cell(Position2D(1, 1), true),
                Cell(Position2D(1, 2), true),
                Cell(Position2D(1, 3), true),
                Cell(Position2D(0, 2), false)
        )
        val game = Game(cells)

        //when
        game.calculateNextGeneration()

        //then
        assertFalse(cells[0].alive)
        assertTrue(cells[1].alive)
        assertFalse(cells[2].alive)
        assertTrue(cells[3].alive)
    }

}
