package ese.kotlin.basics.aj_lambda


fun main(args: Array<String>) {

    fun fibonacci(n: Long): Long {
        class Pair(var nminus2: Long, var nminus1: Long)

        if (n == 0L)
            return 1
        if (n == 1L)
            return 1

        var current = Pair(1, 1)
        for (i in 2..n) {
            current = Pair(current.nminus1, current.nminus2 + current.nminus1)
        }
        return current.nminus1
    }

    println(fibonacci(0))
    println(fibonacci(1))
    println(fibonacci(2))
    println(fibonacci(3))
    println(fibonacci(4))
    println(fibonacci(5))
    println(fibonacci(6))
    println(fibonacci(200))

}

