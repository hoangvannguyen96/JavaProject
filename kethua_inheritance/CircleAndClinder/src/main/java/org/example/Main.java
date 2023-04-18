package org.example;

public class Main {
    public static void main(String[] args) {
        Clinder clinder = new Clinder();
        clinder.getRadius();
        System.out.println(clinder);
        Circle circle=new Circle();
        circle.setRadius(2);
        clinder.setHeight(2);
        clinder.setRadius(2);

        System.out.println(circle.getArea());
        System.out.println(clinder.getArea());
        System.out.println(clinder.Volume());

    }
}