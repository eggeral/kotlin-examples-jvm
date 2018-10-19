package ese.kotlin.basics.ao_java_interop;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class _02_call_kotlin_from_java {

    @Test
    public void propertiesCanBeAccessedUsingGettersAndSetters() {

        KotlinFlight flight = new KotlinFlight("1234");
        assertEquals("1234", flight.getNumber());

        // flight.setNumber() // does not work because number is a val and therefore has no setter
        flight.setOnTime(true); // special handling for "is"
        assertTrue(flight.isOnTime());

    }

    @Test
    public void functionsWithoutAClassInKotlingAreWrappedIntoAClassForJavaAccess() {

        KotlinFlight flight = new KotlinFlight("1234");
        assertEquals("-- 1234 --", KotlinFlightKt.formatFlightNumber(flight)); // The Kotlin Compiler add the suffix Kt

    }

}