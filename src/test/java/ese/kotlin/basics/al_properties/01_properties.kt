package ese.kotlin.basics.al_properties

import java.time.Instant
import kotlin.test.*

class _01_properties {

    @Test
    fun `Kotlin properties can be mutable and immutable`() {

        class Address(val id: Int) {
            var street: String? = null
            var city: String? = null
        }

        val address = Address(10)

        assertEquals(10, address.id)
        assertNull(address.street)
        assertNull(address.city)

        // address.id = 20 can not do this
        address.street = "Feldgasse"
        address.city = "Gleisdorf"

        assertEquals(10, address.id)
        assertEquals(address.street, "Feldgasse")
        assertEquals(address.city, "Gleisdorf")

    }

    @Test
    fun `Kotlin properties can have getters and setters`() {

        class Person(name: String) {

            var firstName: String
            var lastName: String

            init {
                // we will resolve this duplicate code later
                val split = name.split(" ")
                firstName = split[0]
                lastName = split[1]
            }

            var name: String
                get() {
                    return "$firstName $lastName"
                }
                set(value) {
                    val split = value.split(" ")
                    firstName = split[0]
                    lastName = split[1]
                }

        }

        val target = Person("Alexander Egger")

        assertEquals("Alexander Egger", target.name)
        assertEquals("Alexander", target.firstName)
        assertEquals("Egger", target.lastName)

        target.name = "Sarah Egger"

        assertEquals("Sarah Egger", target.name)
        assertEquals("Sarah", target.firstName)
        assertEquals("Egger", target.lastName)

    }

    @Test
    fun `Kotlin properties can be initialized later`() {

        class Person {

            lateinit var firstName: String // but of course this is dangerous
            lateinit var lastName: String

            var name: String
                get() {
                    return "$firstName $lastName"
                }
                set(value) {
                    val split = value.split(" ")
                    firstName = split[0]
                    lastName = split[1]
                }

        }

        val target = Person()

        assertFailsWith<UninitializedPropertyAccessException> { target.name }

        target.name = "Sarah Egger"

        assertEquals("Sarah Egger", target.name)
        assertEquals("Sarah", target.firstName)
        assertEquals("Egger", target.lastName)

    }

    @Test
    fun `Kotlin properties can be initialized lazy`() {

        data class Address(val street: String, val city: String)

        fun getAddressOfPerson(id: Long): Address { // assume we fetch the address from a service or db
            Thread.sleep(1) // 5000 for demo
            return Address("street of $id", "city of $id")
        }

        class Person(val id: Long, val firstName: String, val lastName: String) {
            val address = getAddressOfPerson(id)
        }

        println("${Instant.now()} - Creating a person")
        val person = Person(1L, "Max", "Mustermann")
        println("${Instant.now()} - Person created")

        println("${Instant.now()} - Getting the address of the person")
        assertEquals(Address("street of 1", "city of 1"), person.address)
        println("${Instant.now()} - Got the address of the person")

        class PersonWithLazy(val id: Long, val firstName: String, val lastName: String) {
            val address: Address by lazy { getAddressOfPerson(id) }
        }

        println("${Instant.now()} - Creating a person with lazy")
        val personWithLazy = PersonWithLazy(2L, "Test", "User")
        println("${Instant.now()} - Person with lazy created")

        println("${Instant.now()} - Getting the address of the person with lazy")
        assertEquals(Address("street of 2", "city of 2"), personWithLazy.address)
        println("${Instant.now()} - Got the address of the person with lazy")

    }

}