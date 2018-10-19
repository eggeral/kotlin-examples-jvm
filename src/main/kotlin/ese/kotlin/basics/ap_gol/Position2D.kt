package ese.kotlin.basics.ap_gol

data class Position2D(val x: Int, val y: Int)

infix fun Position2D.distanceFrom(other: Position2D): Double {

    var x1 = x.toDouble()
    var y1 = y.toDouble()


    x1 -= other.x.toDouble()
    y1 -= other.y.toDouble()

    return Math.sqrt(x1 * x1 + y1 * y1)

}


