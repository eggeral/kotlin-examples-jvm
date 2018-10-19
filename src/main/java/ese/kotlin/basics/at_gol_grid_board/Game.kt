package ese.kotlin.basics.at_gol_grid_board

class Game(private val cells: Array<Array<Cell>>) {


    fun calculateNextGeneration() {

        for ((rowIdx, row) in cells.withIndex()) {
            for ((colIdx, cell) in row.withIndex()) {
                cell.livingNeighbours = cells.countLivingNeighbours(colIdx, rowIdx)
            }
        }

        for (row in cells) {
            for (cell in row) {
                cell.calculateNextGeneration()
            }
        }

    }

}

fun Array<Array<Cell>>.countLivingNeighbours1(column: Int, row: Int): Int {
    var count = 0
    if (row >= 1 && column >= 1 && this[row - 1][column - 1].alive) count++
    if (row >= 0 && column >= 1 && this[row][column - 1].alive) count++
    if (row < this.size - 1 && column >= 1 && this[row + 1][column - 1].alive) count++

    if (row >= 1 && this[row - 1][column].alive) count++
    if (row < this.size - 1 && this[row + 1][column].alive) count++

    if (row >= 1 && column < this[row - 1].size - 1 && this[row - 1][column + 1].alive) count++
    if (row >= 0 && column < this[row].size - 1 && this[row][column + 1].alive) count++
    if (row < this.size - 1 && column < this[row + 1].size - 1 && this[row + 1][column + 1].alive) count++

    return count
}

//fun Array<Array<Cell>>.countLivingNeighbours(column: Int, row: Int): Int {
//    val maxRowIdx = size - 1
//    val maxColumnIdx = get(this.size - 1).size - 1
//
//    return (row - 1..row + 1)
//            .flatMap { rowIdx -> (column - 1..column + 1).map { columnIdx -> Pair(columnIdx, rowIdx) } }
//            .asSequence()
//            .filter { it.first in 0..maxColumnIdx } // prevent array out of bounds
//            .filter { it.second in 0..maxRowIdx } // prevent array out of bounds
//            .filter { it.first != column && it.second != row } // do not count the cell itself
//            .map { (columnIdx, rowIdx) -> this[rowIdx][columnIdx] } // get the cell
//            .count { it.alive }
//}

fun Array<Array<Cell>>.countLivingNeighbours(column: Int, row: Int): Int {
    val maxRowIdx = size - 1
    val maxColumnIdx = get(this.size - 1).size - 1

    val rowIndices = (row - 1..row + 1).filter { it in 0..maxRowIdx }
    val columnIndices = (column - 1..column + 1).filter { it in 0..maxColumnIdx }

    return rowIndices
            .flatMap { rowIdx -> columnIndices.map { columnIdx -> Pair(columnIdx, rowIdx) } }
            .asSequence()
            .filter { it != Pair(column, row) } // remove the cell itself
            .map { (columnIdx, rowIdx) -> this[rowIdx][columnIdx] }
            .count { it.alive }

}


