package ese.kotlin.basics.ae_conditionals

fun main(args: Array<String>) {

    // 01 if
    val lhs = 3
    val rhs = 5
    var max = 0

    // traditional use as a statement
    if (lhs > rhs)
        max = lhs
    else
        max = rhs

    println("max = $max")

    // and its use as an expression
    max = if (lhs > rhs) lhs else rhs
    println("max = $max")


    max = if (lhs > rhs) {
        println("lhs is greater")
        lhs // if-branch result
    } else {
        println("lhs is smaller")
        rhs // else-branch result
    }
    println("max = $max")


    // 02 when
    val justAnInt = 5

    when (justAnInt) {
        in Int.MIN_VALUE..1 -> println("very small")
        2 -> println("small")
        3, 4 -> println("large")
        else -> println("unexpected")
    }

    val justAString = "Penny"
    when {
        justAString.length < 3 -> {
            println("$justAString is too short")
            println("we need at least 3 characters for our analysis")
        }
        justAString.startsWith("Oops") -> println("oops...")
        justAString == "Penny" -> println("Leonard is happy")
    }

    val result = when(justAnInt) {
        in Int.MIN_VALUE .. 1 -> "very small"
        2 -> "small"
        3, 4 -> "large"
        else -> "unexpected"
    }
    println(result)


}