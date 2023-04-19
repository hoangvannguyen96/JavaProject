package org.example;

public class ComprableCircle extends Circle implements Comparable<ComprableCircle> {
    public ComprableCircle() {
    }

    public ComprableCircle(double radius) {
        super(radius);
    }

    public ComprableCircle(double radius, String color) {
        super(radius, color);
    }

    @Override
    public int compareTo(ComprableCircle a) {
        if (getRadius() > a.getRadius()) {
            return 1;
        } else if (getRadius() < a.getRadius()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return String.format("%f",getRadius());
    }
}
