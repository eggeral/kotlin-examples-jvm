package ese.kotlin.basics.at_gol_grid_board

fun main(args: Array<String>) {

    val game = Board(9,10)
    game.setCells(
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
        println(game.asAsciiArt())
        println()
        println("---------------------")
        println()
        game.calculateNextGeneration()
    }
}

