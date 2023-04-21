package org.example;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @org.junit.jupiter.api.Test
    void fizzBuzz() {
        int a=24;
        String excepted="hai bon";
        assertEquals(excepted,FizzBuzz.readNumber(a));
    }
}