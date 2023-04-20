package org.example;

public class Circle implements Resizeable {
    private double radius;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public void resizeable(double percent) {
        this.radius *= (1 + (percent / 100.0));
        setRadius(radius);
    }

    @Override
    public String toString() {
        return String.format("Circle có diện tích là %.2f ", this.getArea());
    }
}
