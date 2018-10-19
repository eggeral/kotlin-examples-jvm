@file:Suppress("PackageName")

package ese.kotlin.basics.ad_operators

fun main(args: Array<String>) {

    // 01 bit wise operators
    println("0xfb or 0xbf =  0x${Integer.toHexString(0xfb or 0xbf)}")
    println("0xfb and 0xbf = 0x${Integer.toHexString(0xfb and 0xbf)}")
    println("0xfb xor 0xbf 0x${Integer.toHexString(0xfb xor 0xbf)}")
    println("0xfb inv =  0x${Integer.toHexString(0xfb.inv())}")
    println("0xfb shl 4 = 0x${Integer.toHexString(0xfb shl 4)}")
    println("-20 = 0x${Integer.toHexString(-20)}")
    println("-20 shr 4 = 0x${Integer.toHexString(-20 shr 4)}")
    println("-20 ushr 4 = 0x${Integer.toHexString(-20 ushr 4)}")


    // 02 floating point operators and ranges
    @Suppress("SimplifyBooleanWithConstants")
    println("-0.0 < 0.0 = ${-0.0 < 0.0}")
    println("NaN > inf = ${Double.NaN > Double.POSITIVE_INFINITY}")
    println("NaN < inf =  ${Double.NaN < Double.POSITIVE_INFINITY}")
    println("NaN == inf = ${Double.NaN == Double.POSITIVE_INFINITY}")
    println("3.5 in 1.5..4.0 = ${3.5 in 1.5..4.0}")
    println("3.5 in 1.5..3.5 = ${3.5 in 1.5..3.5}")
    println("3.5 in 3.5..4.0 = ${3.5 in 3.5..4.0}")
    println("3.5 !in 1.5..4.0 = ${3.5 !in 1.5..4.0}")

    println("3 in (1 until 3) = ${3 in (1 until 3)}")
    println("3 in (3 until 5) = ${3 in (3 until 5)}")

}