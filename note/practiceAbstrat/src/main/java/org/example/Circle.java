package org.example;

public class Circle extends Shape implements Resizable {

    private double radius = 1.0;

    private final String name = "Circle";

    @Override
    public boolean isFilled() {
        return super.isFilled();
    }


    @Override
    public void setFilled(boolean filled) {
        super.setFilled(filled);
    }

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
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

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle radius = " + getRadius()+" and color is "+getColor()+" status is "+isFilled();
    }
    public String print(){
        return super.getClass().getSimpleName();
    }

    @Override
    public void resize(double percent) {
        this.radius = this.radius - this.radius*percent;
//        this.radius = this.radius*percent;
    }
}

