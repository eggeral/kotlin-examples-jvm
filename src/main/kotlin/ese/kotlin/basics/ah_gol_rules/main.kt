package ese.kotlin.basics.ah_gol_rules

// https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life

// Given the rules:
// 1. Any live cell with fewer than two live neighbors dies, as if by under population.
// 2. Any live cell with two or three live neighbors lives on to the next generation.
// 3. Any live cell with more than three live neighbors dies, as if by overpopulation.
// 4. Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.

// Implement a function which determines if a cell will be live or dead in the next generation,
// given the cells state and the number of neighbors

// Write a main function which tests the implementation.


//fun isAliveInTheNextIteration(alive: Boolean, livingNeighbours: Int): Boolean {
//    return when {
//        alive && livingNeighbours < 2 -> false
//        alive && (livingNeighbours == 2 || livingNeighbours == 3) -> true
//        alive && livingNeighbours > 3 -> false
//        !alive && livingNeighbours == 3 -> true
//        else -> false
//    }
//}

//fun isAliveInTheNextIteration(alive: Boolean, livingNeighbours: Int): Boolean {
//    return when {
//        alive && (livingNeighbours == 2 || livingNeighbours == 3) -> true
//        !alive && livingNeighbours == 3 -> true
//        else -> false
//    }
//}

fun isAliveInTheNextIteration(alive: Boolean, livingNeighbours: Int): Boolean {
    return when (alive) {
        true -> livingNeighbours in 2..3
        false -> livingNeighbours == 3
    }
}

fun main(args: Array<String>) {

}