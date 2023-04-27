package org.example;

public class Rectangle extends Shape implements Resizable {
    private double width = 1.0;
    private double length = 1.0;

    @Override
    public boolean isFilled() {
        return super.isFilled();
    }

    @Override
    public void setFilled(boolean filled) {
        super.setFilled(filled);
    }

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return "A Rectangle width = "+getWidth()+ " and length = "+getLength()+" color is "+getColor()+" status is "+isFilled();
    }

    @Override
    public void resize(double percent) {
        this.width = this.width - this.width * percent;
        this.length = this.length - this.length * percent;
    }
    public String print(){
        return super.getClass().getSimpleName();
    }
}

