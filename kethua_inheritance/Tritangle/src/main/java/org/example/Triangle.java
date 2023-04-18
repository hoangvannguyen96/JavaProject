package org.example;

public class Triangle extends Shape {
    private double a = 1.0;
    private double b = 1.0;
    private double c = 1.0;

    public Triangle() {

    }
    public Triangle (double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public Triangle(String color,double a,double b,double c){
        super(color);
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double getPeremeter(){
        return (getA()+getB()+getC());
    }
    public double getArea(){
        return Math.sqrt(getPeremeter()/2*(getPeremeter()/2-getA())*(getPeremeter()/2-getB())*(getPeremeter()/2-getC()));
    }

    @Override
    public String toString() {
        return "Triangle có a ="+getA()+", b = "+getB()+" và c = "+getC()+" với diện tích là "+getArea()+" và chu vi là "+getPeremeter()+" và có màu sắc là "+getColor();
    }
}
