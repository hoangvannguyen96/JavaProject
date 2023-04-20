package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void testFizz3() {
        int number = 3;
        String expected = "Fizz";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

}
