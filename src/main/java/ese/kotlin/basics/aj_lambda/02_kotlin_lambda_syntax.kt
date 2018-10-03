package ese.kotlin.basics.aj_lambda

import java.util.Comparator

fun main(args: Array<String>) {

    // 01 -> JavaAlwaysHadLambdas

    // 02 sorting in Kotlin
    val array = arrayOf("z", "B", "a")
    println("original:\t${array.contentToString()}")

    array.sortWith(CaseInsensitiveStringComparator())
    println("sorted: \t${array.contentToString()}")

    // lambda syntax
    array.sortWith(Comparator { lhs: String, rhs: String -> lhs.compareTo(rhs, true) })
    println("sorted: \t${array.contentToString()}")

    class Button(val text: String, val onClick: (x: Int, y: Int) -> Unit) {
        fun click(x: Int, y: Int) {
            println("User clicked the button at $x, $y")
            onClick(x, y)
        }
    }

    val okButton = Button("Ok", { x, y -> println("Ok. Saving the application state") })
    okButton.click(1, 2)

    // cleaned up syntax note that the lambda is outside of the ()
    val cancelButton = Button("Cancel") { _, _ -> println("Cancel. Leaving the dialog") }
    cancelButton.click(1, 2)

    // closures
    val message = "test"
    val showMessageButton = Button("Show") { _, _ -> println("Showing message: $message") }
    showMessageButton.click(1, 2)

    // function references
    val quitHandler = { x: Int, y: Int -> println("Quit app") }
    val quitButton = Button("Quit", quitHandler)
    quitButton.click(1, 2)

    // lambdas can return values
    val logValuesAndReturnSum = {a: Int, b:Int ->
        println(a)
        println(b)
        a + b
    }

    val sum = logValuesAndReturnSum(1,2)
    println("sum: $sum")
}

private class CaseInsensitiveStringComparator : Comparator<String> {
    override fun compare(lhs: String, rhs: String): Int {
        return lhs.compareTo(rhs, true)
    }
}
