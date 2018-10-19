package ese.kotlin.basics.as_delegated_properties

import org.junit.Test
import kotlin.properties.Delegates
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty
import kotlin.test.assertEquals

class DelegatedProperties {

    @Test
    fun `logging the access to a property the standard way`() {

        val accessedProperties = mutableListOf<String>()

        class Vehicle(vid: String) {
            var vid: String
                get() {
                    accessedProperties.add("get Vehicle.vid: $field")
                    return field
                }
                set(value) {
                    accessedProperties.add("set Vehicle.vid: $value")
                    field = value
                }

            init {
                this.vid = vid
            }
        }

        class Person(name: String) {
            var name: String
                get() {
                    accessedProperties.add("get Person.name: $field")
                    return field
                }
                set(value) {
                    accessedProperties.add("set Person.name: $value")
                    field = value
                }

            init {
                this.name = name
            }

        }

        val vehicle = Vehicle("vid12345")
        val person = Person("Max Muster")

        val vid = vehicle.vid
        val name = person.name

        vehicle.vid = "vid99999"
        person.name = "Tom Test"

        assertEquals(listOf(
                "set Vehicle.vid: vid12345",
                "set Person.name: Max Muster",
                "get Vehicle.vid: vid12345",
                "get Person.name: Max Muster",
                "set Vehicle.vid: vid99999",
                "set Person.name: Tom Test")
                , accessedProperties)

    }

    @Test
    fun `logging the access to a property using delegated properties`() {

        val accessedProperties = mutableListOf<String>()

        class Logging<TClass : Any, TProperty : Any>(private val logger: MutableList<String>) : ReadWriteProperty<TClass, TProperty> {

            private lateinit var value: TProperty

            private fun String.verySimpleClassName() = this.substringAfterLast("$")

            override fun getValue(thisRef: TClass, property: KProperty<*>): TProperty {
                logger.add("get ${thisRef::class.java.simpleName.verySimpleClassName()}.${property.name}: $value")
                return value
            }

            override fun setValue(thisRef: TClass, property: KProperty<*>, value: TProperty) {
                logger.add("set ${thisRef::class.java.simpleName.verySimpleClassName()}.${property.name}: $value")
                this.value = value
            }
        }

        class Vehicle(vid: String) {
            var vid: String by Logging(accessedProperties)

            init {
                this.vid = vid
            }
        }

        class Person(name: String) {
            var name: String by Logging(accessedProperties)

            init {
                this.name = name
            }
        }

        val vehicle = Vehicle("vid12345")
        val person = Person("Max Muster")

        val vid = vehicle.vid
        val name = person.name

        vehicle.vid = "vid99999"
        person.name = "Tom Test"

        assertEquals(listOf(
                "set Vehicle.vid: vid12345",
                "set Person.name: Max Muster",
                "get Vehicle.vid: vid12345",
                "get Person.name: Max Muster",
                "set Vehicle.vid: vid99999",
                "set Person.name: Tom Test")
                , accessedProperties)

    }

    @Test
    fun `existing delegates`() {

        val accessedProperties = mutableListOf<String>()

        // Observables
        class Vehicle(vid: String) {

            var vid: String by Delegates.observable(initialValue = vid) { prop, old, new ->
                accessedProperties.add("${prop.name}: $old -> $new")
            }

            init {
                this.vid = vid
            }

        }

        // Properties as map
        // any class having a getValue and setValue can be used for delegated properties
        // that`s why Mutable map works out of the box
        class Person(map: MutableMap<String, Any>) {
            var name: String by map
            var age: Int     by map
        }

        val vehicle = Vehicle("vid12345")

        val personProperties = mutableMapOf(
                "name" to "Max Mustermann",
                "age" to 35
        )

        val person = Person(personProperties)

        val vid = vehicle.vid
        val name = person.name

        vehicle.vid = "vid99999"
        person.name = "Tom Test"
        person.age = 44

        assertEquals(listOf(
                "vid: vid12345 -> vid12345",
                "vid: vid12345 -> vid99999")
                , accessedProperties)

        assertEquals(mapOf(
                "name" to "Tom Test",
                "age" to 44)
                , personProperties)

    }

}