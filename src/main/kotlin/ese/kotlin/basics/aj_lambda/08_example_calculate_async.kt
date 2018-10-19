package ese.kotlin.basics.aj_lambda

fun main(args: Array<String>) {
    val passengers = arrayOf(50, 60, 55)

    runAsync({
        var sum = 0
        for (num in passengers) {
            sum += num
        }
        sum
    }, {
        println(it)
    })
    Thread.sleep(1000)
}

fun <T> runAsync(supplier: () -> T, consumer: (T) -> Unit) {
    val thread = Thread {
        val result = supplier()
        consumer(result)
    }

    thread.start()
}

