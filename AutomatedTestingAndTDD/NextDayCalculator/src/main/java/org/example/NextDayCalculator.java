package org.example;

import java.time.LocalDate;

public class NextDayCalculator {
    public static LocalDate nextDayCalculator(LocalDate date){
        return date.plusDays(1);
    }
}
