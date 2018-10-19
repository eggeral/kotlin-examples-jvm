package ese.kotlin.basics.ap_gol

data class Cell(val position: Position2D, var alive: Boolean) {

    var livingNeighbours: Int = 0

    fun calculateNextGeneration() {
        alive = alive && livingNeighbours in 2..3 ||
                !alive && livingNeighbours == 3
    }

}