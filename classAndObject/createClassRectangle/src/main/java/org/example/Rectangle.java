package org.example;

public class Rectangle {
    double width;
    double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPrimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle có width là: " + width + " và height là: " + height;
    }
}
