package ese.kotlin.basics.aj_lambda


fun calculateAverage(valueSupplier: () -> DoubleArray): Double {
    val values = valueSupplier()
    var sum = 0.0
    for (value in values) {
        sum += value
    }
    return sum / values.size
}


fun main(args: Array<String>) {
    println(calculateAverage { doubleArrayOf(1.0, 2.0, 3.0) })

    println(calculateAverage {
        val values = DoubleArray(10)
        for (idx in 0 until values.size) {
            values[idx] = idx * 3.0
        }
        values
    })
}

