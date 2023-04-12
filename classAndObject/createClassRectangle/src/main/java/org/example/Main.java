package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập width?");
        double width = sc.nextDouble();
        System.out.println("Nhập height?");
        double height = sc.nextDouble();
        Rectangle rec = new Rectangle(width, height);
        System.out.println("Area của rec là: " + rec.getArea());
        System.out.println("Primeter của rec là: " + rec.getPrimeter());
    }
}


