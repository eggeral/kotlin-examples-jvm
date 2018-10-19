package ese.kotlin.basics.ar_gol_grid_array

import ese.kotlin.basics.at_gol_grid_board.Cell
import ese.kotlin.basics.at_gol_grid_board.Game

fun main(args: Array<String>) {

    val cells = arrayOf(
            arrayOf(
                    //0
                    Cell(false),
                    Cell(false),
                    Cell(false),
                    Cell(false),
                    Cell(false),
                    Cell(false),
                    Cell(false),
                    Cell(false)),
            arrayOf(
                    //1
                    Cell(false),
                    Cell(false),
                    Cell(false),
                    Cell(true),
                    Cell(true),
                    Cell(true),
                    Cell(false),
                    Cell(false)),
            arrayOf(
                    //2
                    Cell(false),
                    Cell(false),
                    Cell(false),
                    Cell(false),
                    Cell(true),
                    Cell(false),
                    Cell(false),
                    Cell(false)),
            arrayOf(
                    //3
                    Cell(false),
                    Cell(false),
                    Cell(false),
                    Cell(false),
                    Cell(false),
                    Cell(false),
                    Cell(false),
                    Cell(false)),
            arrayOf(
                    //4
                    Cell(false),
                    Cell(false),
                    Cell(false),
                    Cell(false),
                    Cell(false),
                    Cell(false),
                    Cell(false),
                    Cell(false)),
            arrayOf(
                    //5
                    Cell(false),
                    Cell(false),
                    Cell(true),
                    Cell(true),
                    Cell(true),
                    Cell(false),
                    Cell(false),
                    Cell(false)),
            arrayOf(
                    //6
                    Cell(false),
                    Cell(false),
                    Cell(false),
                    Cell(false),
                    Cell(false),
                    Cell(false),
                    Cell(false),
                    Cell(false)),
            arrayOf(
                    //7
                    Cell(false),
                    Cell(false),
                    Cell(false),
                    Cell(false),
                    Cell(false),
                    Cell(false),
                    Cell(false),
                    Cell(false)),
            arrayOf(
                    //8
                    Cell(false),
                    Cell(false),
                    Cell(true),
                    Cell(true),
                    Cell(true),
                    Cell(false),
                    Cell(false),
                    Cell(false)),
            arrayOf(
                    //9
                    Cell(false),
                    Cell(false),
                    Cell(false),
                    Cell(false),
                    Cell(false),
                    Cell(false),
                    Cell(false),
                    Cell(false))
    )

    val game = Game(cells)

    for (i in 0..19) {
        printCells(cells)
        game.calculateNextGeneration()
    }
}

private fun printCells(cells: Array<Array<Cell>>) {
    println("=======================")
    for (row in cells) {
        for (cell in row) {
            print(if (cell.alive) 1 else 0)
            print(" ")
        }
        println()
    }

}
