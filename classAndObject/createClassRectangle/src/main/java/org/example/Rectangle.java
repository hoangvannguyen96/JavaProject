package org.example;

public class Rectangle {
    public double width;
    public double height;
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle();
        Rectangle rectangle1=new Rectangle(3,5);
        Rectangle rectangle2=new Rectangle(5);
        System.out.println(rectangle1.width);
    }

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public Rectangle( double height) {
        this.width = 1;
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
