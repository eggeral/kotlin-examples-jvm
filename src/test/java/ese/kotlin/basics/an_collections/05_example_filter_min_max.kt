package ese.kotlin.basics.an_collections

import org.junit.Test
import kotlin.test.assertEquals

class _05_example_filter_min_max {

    @Test
    fun `get the timestamps of all measurement points inside of a given range`() {

        class MeasurementPoint(val timestamp: Long, val value: Double)

        //Get the timestamps of all values between a given min max.
        val measurements = listOf(
                MeasurementPoint(1001, 50.0),
                MeasurementPoint(1002, 20.0),
                MeasurementPoint(1003, 11.0),
                MeasurementPoint(1004, 61.0),
                MeasurementPoint(1005, 32.0))

        val filtered = measurements
                .filter { m -> m.value > 15 && m.value < 55 }
                .map { m -> m.timestamp }

        assertEquals(listOf(1001L, 1002L, 1005L), filtered)
    }
}
