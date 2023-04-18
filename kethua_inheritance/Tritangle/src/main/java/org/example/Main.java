package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập độ dài cạnh a?");
        double a=sc.nextDouble();
        System.out.println("Nhập độ dài cạnh b?");
        double b=sc.nextDouble();
        System.out.println("Nhập độ dài cạnh c?");
        double c=sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhập màu của tam giác?");
        String color=sc.nextLine();
        if(a<=0||b<=0||c<=0){
            System.out.println("độ dài cạnh phải là 1 số dương");
        }
        else if(a>=b+c||b>=a+c||c>=a+b){
            System.out.println("độ dài 3 cạnh đã nhập không thể hình thành một tam giác");
        }else{
            Triangle triangle=new Triangle(color,a,b,c);
            triangle.getPeremeter();
            triangle.getArea();
            triangle.getColor();
            System.out.println(triangle);
        }
    }
}