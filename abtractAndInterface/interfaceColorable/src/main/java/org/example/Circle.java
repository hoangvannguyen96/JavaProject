package org.example;

public class Circle implements Colorable {
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
    public String howToColor() {
        return "Color all four sides";
    }

    @Override
    public String toString() {
        return String.format("Circle có diện tích là %.2f ", this.getArea());
    }
}

