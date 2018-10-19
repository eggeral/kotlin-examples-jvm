package ese.kotlin.basics.aj_lambda

fun main(args: Array<String>) {

    fun fibonacci(n: Int): Int {
        return when (n) {
            0 -> 1
            1 -> 1
            else -> fibonacci(n - 1) + fibonacci(n - 2)
        }
    }

    println(fibonacci(0))
    println(fibonacci(1))
    println(fibonacci(2))
    println(fibonacci(3))
    println(fibonacci(4))
    println(fibonacci(5))
    println(fibonacci(6))
    println(fibonacci(45))
}

