package ese.kotlin.basics.ap_gol

class Game(private val cells: List<Cell>) {

    fun calculateNextGeneration() {

        for (cell in cells) {
            var numberOfLivingNeighbours = 0
            for (potentialNeighbour in cells) {
                val distance = cell.position distanceFrom potentialNeighbour.position
                if (potentialNeighbour.alive && distance > 0 && distance < 2.0)
                    numberOfLivingNeighbours++
            }
            cell.livingNeighbours = numberOfLivingNeighbours
        }

        cells.forEach { cell -> cell.calculateNextGeneration() }

    }

}
