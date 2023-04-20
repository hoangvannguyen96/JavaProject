package org.example;

public class Square implements Colorable{
    private double side;

    public Square() {

    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public String howToColor(){
        return "Color all four sides";
    }
    @Override
    public String toString() {
        return String.format("Square có diện tích là %.2f ", this.getArea());
    }
}
