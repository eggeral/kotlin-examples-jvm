package ese.kotlin.basics.ac_data_types


fun main(args: Array<String>) {

    // 01 basic types
    val anIntValue: Int = 17 // explicit type and initialization
    val anotherIntValue = 4 // implicit type
    val aShortValue: Short = 42
    val aByteValue: Byte = 7
    val aLongValue: Long = 6L
    val aFloatValue: Float = 17.0F
    val aDoubleValue: Double = 4.0

    val aChar: Char = 'a' // Chars are not numbers in Kotlin!
    val anotherChar: Char = 31.toChar() // explicit conversion

    val intFromHexLiteral = 0x1234
    val intFromBinaryLiteral = 0b00100101
    val longFromHexLiteral = 0x1234L
    val longFromBinaryLiteral = 0b00100101L

    val doubleFromSciNotation = 17.4e5

    val readableInt = 12_345_678 // same as in Java

    val aString = "Lorelai"

    // 02 string templates
    println("anIntValue=$anIntValue")
    println("anotherIntValue=$anotherIntValue")
    println("sum: ${anIntValue + anotherIntValue}")
    val multiLineString =
            """
                hallo
                world
            """
    println(multiLineString)

    val trimmedMultiLineString =
            """
                hallo
                world
            """.trimIndent()
    println(trimmedMultiLineString)

    val trimmedMarginMultiLineString =
            """
                |  hallo
                |  world
            """.trimMargin()
    println(trimmedMarginMultiLineString)

    // 03 val or var
    val foo: Int = 1
    // foo = 2 // does not work
    var bar: Int = 1
    bar = 2
    println("bar=$bar")

    // 04 Type inferring
    val bob = "Test" // val bob: String = "Test"

    // 05 Nullables
    val nullableInt0: Int? = null
    val nullableInt1: Int? = 4

    // --- the following statements lead to compile-errors
    //     val converted = nullableInt1.toByte()
    //     var nullableSum = nullableInt0 + nullableInt1

    // --- only execute if non-null
    val nullSafe1: Byte? = nullableInt1?.toByte()
    val nullSafe0 = nullableInt0?.toByte()

    // --- assume non-null
    val forced1: Byte = nullableInt1!!.toByte()
    //    val forced0 = nullableInt0!!.toByte() //  would throw

    // --- Elvis-operator: switch on null
    val nullSafe2 = nullableInt0?.toByte() ?: 99.toByte()

    val nullableString0: String? = null
    val nullableString1: String? = "Sheldon"

    println("nullSafe1 = $nullSafe1, nullSafe0 = $nullSafe0, \n" +
            "forced 1 = $forced1, " +
            "nullSafe2 = $nullSafe2, \n" +
            "nullableString0 = $nullableString0, " +
            "nullableString1 = $nullableString1")

    // 06 arrays

    val intArray: Array<Int> = arrayOf(1, 2, 3, 4)
    val nullableIntArray: Array<Int?> = arrayOfNulls(4)
    val calculatedArray: Array<String> = Array(5) { idx -> "${idx * idx}" } // array initialised by a function
    val arrayWithoutBoxingOverhead: IntArray = intArrayOf(1, 2, 3, 4)

    // 07
    // smaller types can not be assigned to larger type in
    // order to avoid failing equals checks due to autoboxing
    // see JavaAutoBoxingCompareProblem

    // Hypothetical code, does not actually compile: (from Kotlin documentation)
    //val a: Int? = 1 // A boxed Int (java.lang.Integer)
    //val b: Long? = a // implicit conversion yields a boxed Long (java.lang.Long)
    //print(b == a) // Surprise! This prints "false" as Long's equals() checks whether the other is Long as well

    val aShort: Short = 42
    var anInt = 45
    // anInt = aShort / does not compile
    anInt = aShort.toInt()
    println(anInt == 42)

    // Still be aware that two autoboxed value do not have the same reference ==
    val a: Int = 10000
    println(a == a) // Prints 'true'
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
    println(boxedA == anotherBoxedA) // !!!Prints 'true'!!!
    println(boxedA === anotherBoxedA) // !!!Prints 'false'!!!

}