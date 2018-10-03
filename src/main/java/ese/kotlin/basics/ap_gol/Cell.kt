package ese.kotlin.basics.ap_gol

class Cell(val position: Position2D, var alive: Boolean) {

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
