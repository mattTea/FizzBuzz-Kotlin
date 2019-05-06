import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.jupiter.api.DisplayName

internal class FizzBuzzTests {

    @Test
    @DisplayName("Returns 'Fizz' for 3.") // <- doesn't seem to display anywhere though!
    fun `Returns Fizz when 3 entered`() {
        assertEquals("Fizz", fizzBuzz(3))
    }

    @Test
    fun `Returns Buzz when 5 entered`() {
        assertEquals("Buzz", fizzBuzz(5))
    }

    @Test
    fun `Returns 1 if 1 entered`() {
        assertEquals(1, fizzBuzz(1))
    }

    @Test
    fun `Returns Fizz for multiple of 3 (12)`() {
        assertEquals("Fizz", fizzBuzz(12))
    }

    @Test
    fun `Returns Buzz for multiple of 5 (20)`() {
        assertEquals("Buzz", fizzBuzz(20))
    }

    @Test
    fun `Returns FizzBuzz for multiple of 3 and 5 (15)`() {
        assertEquals("FizzBuzz", fizzBuzz(15))
    }

    private fun fizzBuzz(i: Int): Any? {
        if (i % 15 === 0) {
            return "FizzBuzz"
        } else if (i % 3 === 0) {
            return "Fizz"
        } else if (i % 5 === 0) {
            return "Buzz"
        } else {
            return i
        }

    }

}
