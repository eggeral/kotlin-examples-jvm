package ese.kotlin.basics.af_loops


fun main(args: Array<String>) {

    val planets = arrayOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")

    for (planet in planets) {
        println(planet)
    }

    for (idx in 1..3)
        println(planets[idx])

    for (idx in 6 downTo 2 step 2)
        println(planets[idx])

    for (idx in 0 until 4)
        println(planets[idx])

    for (idx in planets.indices)
        println(planets[idx])

    for ((idx, value) in planets.withIndex())
        println("idx: $idx - planet: ${planets[idx]}")


    var idx = 7
    while (idx >= 0) {
        println(planets[idx])
        idx --
    }

    idx = 0
    do {
        println(planets[idx])
        idx ++
    } while (idx <= 7)

}