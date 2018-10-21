package ese.kotlin.basics.av_collection_performance

import java.util.stream.Stream


fun Array<Array<Cell>>.calculateNextGeneration(countLivingNeighbours: Array<Array<Cell>>.(Int, Int) -> Int) {

    for ((rowIdx, row) in this.withIndex()) {
        for ((colIdx, cell) in row.withIndex()) {
            cell.livingNeighbours = this.countLivingNeighbours(colIdx, rowIdx)
        }
    }

    for (row in this) {
        for (cell in row) {
            cell.calculateNextGeneration()
        }
    }

}


fun Array<Array<Cell>>.countLivingNeighboursUsingIfs(column: Int, row: Int): Int {
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

fun Array<Array<Cell>>.countLivingNeighboursUsingForLoop(column: Int, row: Int): Int {
    val columnSize = get(this.size - 1).size

    var count = 0

    for (rowIdx in row - 1..row + 1) {
        for (columnIdx in column - 1..column + 1) {
            if (rowIdx in 0 until size
                    && columnIdx in 0 until columnSize
                    && !(rowIdx == row && columnIdx == column))
                count++
        }
    }

    return count
}

fun Array<Array<Cell>>.countLivingNeighboursUsingKotlinCollectionExtensions(column: Int, row: Int): Int {
    val maxRowIdx = size - 1
    val maxColumnIdx = get(this.size - 1).size - 1

    return (row - 1..row + 1)
            .flatMap { rowIdx -> (column - 1..column + 1).map { columnIdx -> Pair(columnIdx, rowIdx) } }
            .filter { it.first in 0..maxColumnIdx } // prevent array out of bounds
            .filter { it.second in 0..maxRowIdx } // prevent array out of bounds
            .filter { it != Pair(column, row) } // do not count the cell itself
            .map { get(it.second)[it.first] }.count { it.alive }
}

fun Array<Array<Cell>>.countLivingNeighboursUsingKotlinSequences(column: Int, row: Int): Int {
    val maxRowIdx = size - 1
    val maxColumnIdx = get(this.size - 1).size - 1

    return (row - 1..row + 1)
            .flatMap { rowIdx -> (column - 1..column + 1).map { columnIdx -> Pair(columnIdx, rowIdx) } }
            .asSequence()
            .filter { it.first in 0..maxColumnIdx } // prevent array out of bounds
            .filter { it.second in 0..maxRowIdx } // prevent array out of bounds
            .filter { it != Pair(column, row) } // do not count the cell itself
            .map { get(it.second)[it.first] }.count { it.alive }
}

fun Array<Array<Cell>>.countLivingNeighboursUsingJavaStreams(column: Int, row: Int): Int {
    val maxRowIdx = size - 1
    val maxColumnIdx = get(this.size - 1).size - 1

    return Stream.of(row - 1, row, row + 1)
            .flatMap { rowIdx -> Stream.of(column - 1, column, column + 1).map { columnIdx -> Pair(columnIdx, rowIdx) } }
            .filter { it.first in 0..maxColumnIdx } // prevent array out of bounds
            .filter { it.second in 0..maxRowIdx } // prevent array out of bounds
            .filter { it != Pair(column, row) } // do not count the cell itself
            .map { get(it.second)[it.first] }
            .filter { it.alive }
            .count().toInt()

}
