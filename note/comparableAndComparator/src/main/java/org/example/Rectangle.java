package org.example;

public class Rectangle implements Comparable<Rectangle>{
    private double width;
    private double height;
    public Rectangle(){

    }
    public Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }
    public double getArea(){
        return this.width*this.height;
    }
    public double getPerimeter(){
        return (this.width+this.height)*2;
    }
    public String toString(){
        return "width: "+width+" height: "+height;
    }

    @Override
    public int compareTo(Rectangle o) {
        return (int) (o.getArea()-this.getArea());
    }
}
