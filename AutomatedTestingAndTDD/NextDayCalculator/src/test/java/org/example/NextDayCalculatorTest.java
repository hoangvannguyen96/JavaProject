package org.example;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NextDayCalculatorTest {

    @org.junit.jupiter.api.Test
    void nextDayCalculatorTest() {
        LocalDate date= LocalDate.of(2023, 1, 23);
        LocalDate expected= LocalDate.of(2023, 1, 25);
        LocalDate result=NextDayCalculator.nextDayCalculator(date);
        assertEquals(expected,result);
    }
}