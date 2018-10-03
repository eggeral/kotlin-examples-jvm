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

    // continue / break

    for (x in 1 .. 3) {
        for (y in 1..10) {
            if (y > 2)
                break
            println("x: $x, y: $y")
        }
    }

    outer@ for (x in 1 .. 3) {
        for (y in 1..10) {
            if (y > 2)
                break@outer
            println("x: $x, y: $y")
        }
    }

}