package ese.kotlin.basics.ad_operators


fun main(args: Array<String>) {

    // 01 bit wise operators
    println("or: 0x${Integer.toHexString(0xfb or 0xbf)}")
    println("and: 0x${Integer.toHexString(0xfb and 0xbf)}")
    println("xor: 0x${Integer.toHexString(0xfb xor 0xbf)}")
    println("inv: 0x${Integer.toHexString(0xfb.inv())}")
    println("shl: 0x${Integer.toHexString(0xfb shl 4)}")
    println("shr: 0x${Integer.toHexString(-20 shr 4)}")
    println("ushr: 0x${Integer.toHexString(-20 ushr 4)}")


    // 02 floating point operators and ranges
    println("-0.0 < 0.0: ${-0.0 < 0.0}")
    println("NaN > inf: ${Double.NaN > Double.POSITIVE_INFINITY}")
    println("NaN < inf: ${Double.NaN < Double.POSITIVE_INFINITY}")
    println("NaN == inf: ${Double.NaN == Double.POSITIVE_INFINITY}")
    println("3.5 in 1.5..4.0: ${3.5 in 1.5..4.0}")
    println("3.5 in 1.5..3.5: ${3.5 in 1.5..3.5}")
    println("3.5 in 3.5..4.0: ${3.5 in 3.5..4.0}")
    println("3.5 !in 1.5..4.0: ${3.5 !in 1.5..4.0}")

    println("3 in (1 until 3): ${3 in (1 until 3)}")
    println("3 in (3 until 5): ${3 in (3 until 5)}")


}