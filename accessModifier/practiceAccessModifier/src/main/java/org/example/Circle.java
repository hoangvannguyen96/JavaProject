package org.example;

public class Circle {
    private double radius=1.0;
    private String color="red";
    public Circle(){
    }
    public Circle(double radius,String color){
        this.radius=radius;
        this.color=color;
    }

    double getRadius() {
        return radius;
    }
    double getArea(){
        return radius*radius*Math.PI;
    }
}
