package org.example;

public class Rectangle implements Resizeable {
    private double width;
    private double height;

    public Rectangle() {

    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    @Override
    public void resizeable(double percent) {
        this.width = this.width + this.width * (percent / 100.0);
        setWidth(width);
        this.height = this.height + this.height * (percent / 100.0);
        setHeight(height);
    }

    @Override
    public String toString() {
        return String.format("Rectangle có diện tích là %.2f ", this.getArea());
    }
}
