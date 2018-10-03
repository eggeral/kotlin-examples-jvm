package ese.kotlin.basics.ap_gol

import java.util.Arrays

fun main(args: Array<String>) {
    val cells = Arrays.asList(
            //0
            Cell(Position2D(0, 0), false),
            Cell(Position2D(0, 1), false),
            Cell(Position2D(0, 2), false),
            Cell(Position2D(0, 3), false),
            Cell(Position2D(0, 4), false),
            Cell(Position2D(0, 5), false),
            Cell(Position2D(0, 6), false),
            Cell(Position2D(0, 7), false),
            //1
            Cell(Position2D(1, 0), false),
            Cell(Position2D(1, 1), false),
            Cell(Position2D(1, 2), false),
            Cell(Position2D(1, 3), true),
            Cell(Position2D(1, 4), true),
            Cell(Position2D(1, 5), true),
            Cell(Position2D(1, 6), false),
            Cell(Position2D(1, 7), false),
            //2
            Cell(Position2D(2, 0), false),
            Cell(Position2D(2, 1), false),
            Cell(Position2D(2, 2), false),
            Cell(Position2D(2, 3), false),
            Cell(Position2D(2, 4), true),
            Cell(Position2D(2, 5), false),
            Cell(Position2D(2, 6), false),
            Cell(Position2D(2, 7), false),
            //3
            Cell(Position2D(3, 0), false),
            Cell(Position2D(3, 1), false),
            Cell(Position2D(3, 2), false),
            Cell(Position2D(3, 3), false),
            Cell(Position2D(3, 4), false),
            Cell(Position2D(3, 5), false),
            Cell(Position2D(3, 6), false),
            Cell(Position2D(3, 7), false),
            //4
            Cell(Position2D(4, 0), false),
            Cell(Position2D(4, 1), false),
            Cell(Position2D(4, 2), false),
            Cell(Position2D(4, 3), false),
            Cell(Position2D(4, 4), false),
            Cell(Position2D(4, 5), false),
            Cell(Position2D(4, 6), false),
            Cell(Position2D(4, 7), false),
            //5
            Cell(Position2D(5, 0), false),
            Cell(Position2D(5, 1), false),
            Cell(Position2D(5, 2), true),
            Cell(Position2D(5, 3), true),
            Cell(Position2D(5, 4), true),
            Cell(Position2D(5, 5), false),
            Cell(Position2D(5, 6), false),
            Cell(Position2D(5, 7), false),
            //6
            Cell(Position2D(6, 0), false),
            Cell(Position2D(6, 1), false),
            Cell(Position2D(6, 2), false),
            Cell(Position2D(6, 3), false),
            Cell(Position2D(6, 4), false),
            Cell(Position2D(6, 5), false),
            Cell(Position2D(6, 6), false),
            Cell(Position2D(6, 7), false),
            //7
            Cell(Position2D(7, 0), false),
            Cell(Position2D(7, 1), false),
            Cell(Position2D(7, 2), false),
            Cell(Position2D(7, 3), false),
            Cell(Position2D(7, 4), false),
            Cell(Position2D(7, 5), false),
            Cell(Position2D(7, 6), false),
            Cell(Position2D(7, 7), false)
    )

    val game = Game(cells)

    for (i in 0..19) {
        printCells(cells)
        game.calculateNextGeneration()
    }
}

private fun printCells(cells: List<Cell>) {
    println("=======================")
    for (i in cells.indices) {
        print(if (cells[i].alive) 1 else 0)
        print(" ")
        if ((i + 1) % 8 == 0)
            println()

    }
}
