package org.example;

public class Main {
    public static void main(String[] args){
        try {
            Triangle triangle=new Triangle(2,3,0);
            System.out.println(triangle.toString());
        }catch (TriangleException triangleException){
            System.out.println(triangleException.getMessage());
        }
    }
}