package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        Point3D point3D=new Point3D();
        point2D.setXY(3,5);
        System.out.println(point2D);
        point3D.setXYZ(3,4,5);
        System.out.println(point3D);
    }
}