package ese.kotlin.basics.at_gol_grid_board

fun main(args: Array<String>) {

    val board = Board(10,10)
    board.setCells(
            """
            _________
            __***____
            ___*_____
            ____*____
            ___***___
            _________
            _________

            """.trimIndent().cells())

    for (i in 0..19) {
        println(board.asAsciiArt())
        println()
        println("---------------------")
        println()
        board.calculateNextGeneration()
    }
}

fun Board.asAsciiArt(): String {
    val builder = StringBuilder()
    for (row in 0 until rows) {
        for (column in 0 until columns) {
            val cell = cellAt(column = column, row = row)
            builder.append(if (cell.alive) "*" else "_")
        }
        builder.append('\n')
    }
    return builder.toString()
}
