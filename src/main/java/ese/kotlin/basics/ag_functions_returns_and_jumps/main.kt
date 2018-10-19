package ese.kotlin.basics.ag_functions_returns_and_jumps

fun main(args: Array<String>) {

    fun basicFunction() {
        println("Hello")
        return Unit // functions without return value return Unit
    }
    basicFunction()

    fun basicFunctionWithParameter(greeting: String) {
        println("Hello $greeting")
    }
    basicFunctionWithParameter("world")
    basicFunctionWithParameter(greeting = "world")

    fun basicFunctionWithDefaultValue(greeting: String = "world") {
        println("Hello $greeting")
    }
    basicFunctionWithDefaultValue()


    fun basicFunction(greeting: String = "world") {// DANGER!
        println("Hello $greeting")
    }
    basicFunction()

    // named parameters
    fun calculateDistance(x1: Double, y1: Double, x2: Double, y2: Double): Double {
        val deltaX = x1 - x2
        val deltaY = y1 - y2

        return Math.sqrt(deltaX * deltaX + deltaY * deltaY)
    }

    // note that the order of the parameters can be changed!
    val distance = calculateDistance(x1 = 0.0, x2 = 10.0, y1 = 0.0, y2 = 10.0)
    println("distance = $distance")

    // function can have names with spaces
    // does not work in Android!
    fun `this is usefull for test cases`() {

    }

    // return from a function
    fun foo(): Int {
        return 10
    }
    println("foo: ${foo()}")

    fun bar(test: Int) {
        if (test > 100) {
            println("test > 100")
            return
        }
        println("test <= 100")
    }

    bar(90)
    bar(101)

    // break
    println("== break")
    for (x in 1..3) {
        for (y in 1..10) {
            if (y > 2)
                break
            println("x: $x, y: $y")
        }
    }

    outer@ for (x in 1..3) {
        for (y in 1..10) {
            if (y > 2)
                break@outer
            println("x: $x, y: $y")
        }
    }

    // continue
    println("== continue")
    for (x in 1..3) {
        for (y in 1..10) {
            if (y > 2)
                continue
            println("x: $x, y: $y")
        }
    }

    outer@ for (x in 1..3) {
        for (y in 1..10) {
            if (y > 2)
                continue@outer
            println("x: $x, y: $y")
        }
    }


}