package ese.kotlin.basics.ak_unit_testing

import kotlin.test.*

// 0. add
// testImplementation "org.jetbrains.kotlin:kotlin-test-junit:$kotlin_version" to build.gradle dependencies
// remove junit dependency


class KotlinTestExamples {

    // @Rule // only availabe using org.junit.Rule directly
    // var expected = ExpectedException.none()

    // temporary folders
    // @Rule
    //internal var tmpFolder = TemporaryFolder()

    @BeforeTest // @Before in JUnit
    fun before() {
        println("Executed before each test.")
    }

    @AfterTest // @After in JUnit
    fun after() {
        println("Executed after each test.")

    }

    @Test
    fun basic() {

        // same asserts as in JUnit3/4
        assertEquals("test", "test")
        assertTrue(1 == 1)

        // asserts can take lambdas
        assertTrue("One should be one", { 1 == 1 })

    }

// Exception handling with JUnit

    //    @Test(expected = IllegalArgumentException::class)
//    fun exception() {
//        throw IllegalArgumentException("test")
//    }
//
//    @Test
//    fun exceptionWithRules() {
//        expected.expect(IllegalArgumentException::class.java)
//        throw IllegalArgumentException("test")
//    }

    @Test
    fun todo() {
        todo {
            assertTrue(false) // keep a reference to the actual code but do no fail
        }
    }

    @Test
    @Ignore
    fun ignoredTest() {
        fail("This test is ignored")

    }

    @Test
    fun exception() {
        // this is great
        assertFails { throw IllegalArgumentException("test") }
        assertFailsWith<IllegalArgumentException> { throw IllegalArgumentException("test") }
        assertFailsWith(IllegalArgumentException::class) { throw IllegalArgumentException("test") }
    }


}
