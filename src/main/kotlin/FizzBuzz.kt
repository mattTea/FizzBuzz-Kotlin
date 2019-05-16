class FizzBuzz {

//    fun fizzBuzz(i: Int): Any {
//        if (i % 15 === 0) {
//            return "FizzBuzz"
//        } else if (i % 3 === 0) {
//            return "Fizz"
//        } else if (i % 5 === 0) {
//            return "Buzz"
//        } else {
//            return i
//        }
//    }

    fun fizzBuzz(i: Int): Any {
        when (i % 15 == 0) {
            true -> return "FizzBuzz"
        }
        when (i % 3 == 0) {
            true -> return "Fizz"
        }
        when (i % 5 == 0) {
            true -> return "Buzz"
            false -> return i
        }
    }
}
