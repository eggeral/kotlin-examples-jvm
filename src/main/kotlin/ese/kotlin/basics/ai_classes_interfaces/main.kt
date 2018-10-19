package ese.kotlin.basics.ai_classes_interfaces


// 01 simple Java like definition of a class
class SimpleClass {

}

// 02 class with primary constructor and property
class Person(name: String) {

    val name: String

    init {
        this.name = name
    }
}

// 03 class with property initializers
class PersonWithProperties(val name: String)

// 04 secondary constructor
class PersonWithSecondaryConstructor(val name: String) {
    constructor(firstName: String, lastName: String) : this("$firstName $lastName") {
        // ...
    }
}

// 05 properties with default values
class PersonWithDefaultValues(val name: String = "Max Muster")

// 06 class with functions
class PersonWithFunctions(val name: String) {
    fun countAInName(): Int {
        var count = 0
        for (char in name) {
            if (char.toLowerCase() == 'a')
                count++
        }
        return count
    }
}

// 07 interface
interface Animal {
    val name: String
}

class Dog(override val name: String) : Animal {
    fun bark() {
        println("Wau")
    }
}

class Cat(override val name: String) : Animal {
    fun purr() {
        println("Brrrr")
    }
}


// 08 create instances of classes
fun creatingInstances() {
    val person = PersonWithFunctions("Alexander")
    println(person.countAInName())

    val cat = Cat("Minka")
    cat.purr()
}

// 09 data classes
data class PersonAsDataClass(val firstName: String, val lastName: String)

fun dataClasses() {
    // data classes implement toString
    val p1 = PersonAsDataClass("Max", "Mustermann")

    println(p1)

    // data classes implement equals and hashCode
    val p2 = PersonAsDataClass("Max", "Mustermann")
    val p3 = PersonAsDataClass("Test", "User")

    println("$p1 == $p2 = ${p1 == p2}")
    println("$p1 == $p3 = ${p1 == p3}")

    println("$p1.hashCode() = ${p1.hashCode()}")
    println("$p2.hashCode() = ${p2.hashCode()}")

    // data classes implement componentN
    println("$p1.component1() == ${p1.component1()}")
    println("$p1.component2() == ${p1.component2()}")

    // data classes implement copy
    val p4 = p1.copy()
    println(p4)

    val p5 = p1.copy(firstName = "Test") // copy all properties but set firstName to Test
    println(p5)

}

fun main(args: Array<String>) {
    creatingInstances()
    println()
    println("======================")
    println()
    dataClasses()
}