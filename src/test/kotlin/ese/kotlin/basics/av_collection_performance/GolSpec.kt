package ese.kotlin.basics.av_collection_performance

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class GolSpec {

    @Test
    fun aGameCanCalculateTheNextGeneration() {

        runNextGenerationTestUsing { column, row -> countLivingNeighboursUsingIfs(column, row) }
        runNextGenerationTestUsing { column, row -> countLivingNeighboursUsingForLoop(column, row) }
        runNextGenerationTestUsing { column, row -> countLivingNeighboursUsingKotlinCollectionExtensions(column, row) }
        runNextGenerationTestUsing { column, row -> countLivingNeighboursUsingKotlinSequences(column, row) }
        runNextGenerationTestUsing { column, row -> countLivingNeighboursUsingJavaStreams(column, row) }

    }

    private fun runNextGenerationTestUsing(countLivingNeighbours: Array<Array<Cell>>.(Int, Int) -> Int) {
        //given
        val cells = arrayOf(
                arrayOf(Cell(false), Cell(true), Cell(false)),
                arrayOf(Cell(false), Cell(true), Cell(false)),
                arrayOf(Cell(false), Cell(true), Cell(false))
        )


        //when
        cells.calculateNextGeneration(countLivingNeighbours)

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
        runCountTestUsing { column, row -> countLivingNeighboursUsingIfs(column, row) }
        runCountTestUsing { column, row -> countLivingNeighboursUsingForLoop(column, row) }
        runCountTestUsing { column, row -> countLivingNeighboursUsingKotlinCollectionExtensions(column, row) }
        runCountTestUsing { column, row -> countLivingNeighboursUsingKotlinSequences(column, row) }
        runCountTestUsing { column, row -> countLivingNeighboursUsingJavaStreams(column, row) }
    }

    private fun runCountTestUsing(countLivingNeighbours: Array<Array<Cell>>.(Int, Int) -> Int) {
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

