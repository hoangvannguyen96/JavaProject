package org.example;

public class Clinder extends Circle{
    private double height;

    public Clinder() {
    }

    public Clinder(double height) {
        this.height = height;
    }

    public Clinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double Volume(){
        return super.getArea()*this.height;
    }
    public double getArea() {
        return super.getPerimeter()*this.height+2*super.getArea();
    }
}
