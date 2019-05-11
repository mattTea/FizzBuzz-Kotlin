import org.junit.Assert.assertEquals
import org.junit.jupiter.api.Test

class FizzBuzzTest {

    private val fizzbuzz = FizzBuzz()

    @Test
    fun `Returns Fizz when 3 entered`() {
        assertEquals("Fizz", fizzbuzz.fizzBuzz(3))
    }


    @Test
    fun `Returns Buzz when 5 entered`() {
        assertEquals("Buzz", fizzbuzz.fizzBuzz(5))
    }

    @Test
    fun `Returns 1 if 1 entered`() {
        assertEquals(1, fizzbuzz.fizzBuzz(1))
    }

    @Test
    fun `Returns Fizz for multiple of 3 (12)`() {
        assertEquals("Fizz", fizzbuzz.fizzBuzz(12))
    }

    @Test
    fun `Returns Buzz for multiple of 5 (20)`() {
        assertEquals("Buzz", fizzbuzz.fizzBuzz(20))
    }

    @Test
    fun `Returns FizzBuzz for multiple of 3 and 5 (15)`() {
        assertEquals("FizzBuzz", fizzbuzz.fizzBuzz(15))
    }

}