package ese.kotlin.basics.at_gol_grid_board

data class Cell(var alive: Boolean) {

    var livingNeighbours: Int = 0

    fun calculateNextGeneration() {
        if (alive) {
            if (!(livingNeighbours == 2 || livingNeighbours == 3)) {
                alive = false
            }
        } else {
            if (livingNeighbours == 3) {
                alive = true
            }
        }
    }

}
