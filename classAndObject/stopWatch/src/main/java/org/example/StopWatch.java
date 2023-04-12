package org.example;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class StopWatch {
    private LocalTime startTime;
    private LocalTime endTime;

    public StopWatch() {
        this.startTime=LocalTime.now();
    }

    public LocalTime getStartTime() {

        return this.startTime;
    }

    public LocalTime getEndTime() {

        return this.endTime;
    }

    public void start() {

        this.startTime = LocalTime.now();
    }

    public void stop() {

        this.endTime = LocalTime.now();
    }

    public Duration getElapsedTime() {
        Duration time = Duration.between(this.startTime, this.endTime);
        return time;
    }
}