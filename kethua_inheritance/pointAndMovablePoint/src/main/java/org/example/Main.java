package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point point=new Point();
        MovablePoint movablePoint=new MovablePoint(1,1,2,2);
        System.out.println(movablePoint);
        System.out.println(Arrays.toString(movablePoint.move()));
    }
}