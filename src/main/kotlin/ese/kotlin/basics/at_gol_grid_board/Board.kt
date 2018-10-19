package ese.kotlin.basics.at_gol_grid_board

data class Position2d(val column: Int, val row: Int)

class Board(val columns: Int, val rows: Int) {

    private val cells: Array<Array<Cell>> = Array(rows) { _ -> Array(columns) { Cell(false) } }

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

    fun cellAt(column: Int, row: Int) = cells[row][column]
    fun cellAt(position2d: Position2d) = cells[position2d.row][position2d.column]

    fun setCells(cellDefinitions: Map<Position2d, Boolean>) {
        for (cellDefinition in cellDefinitions.entries) {
            cellAt(cellDefinition.key).alive = cellDefinition.value
        }
    }

    fun countLivingNeighbours(column: Int, row: Int) = (row - 1..row + 1)
            .flatMap { rowIdx -> (column - 1..column + 1).map { columnIdx -> Position2d(columnIdx, rowIdx) } }
            .asSequence()
            .filter { it.column in 0 until columns } // prevent array out of bounds
            .filter { it.row in 0 until rows } // prevent array out of bounds
            .filter { it != Position2d(column = column, row = row) } // do not count the cell itself
            .map { cellAt(it) }.count { it.alive }

    fun asAsciiArt(): String {
        val builder = StringBuilder()
        for (row in cells) {
            for (cell in row) {
                builder.append(if (cell.alive) "*" else "_")
            }
            builder.append('\n')
        }
        return builder.toString()
    }
}


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


fun String.cells(): Map<Position2d, Boolean> {
    val result = mutableMapOf<Position2d, Boolean>()
    for ((row, line) in this.lines().withIndex()) {
        for ((column, char) in line.withIndex()) {
            result[Position2d(column, row)] = (char == '*')
        }
    }
    return result
}

fun Map<Position2d, Boolean>.translatedTo(column: Int, row: Int): Map<Position2d, Boolean> {
    val result = mutableMapOf<Position2d, Boolean>()
    for (entry in this.entries) {
        result[Position2d(entry.key.column + column, entry.key.row + row)] = entry.value
    }
    return result
}

