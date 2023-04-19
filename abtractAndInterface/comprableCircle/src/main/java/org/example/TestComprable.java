package org.example;

import java.util.Arrays;

public class TestComprable {
    public static void main(String[] args) {
        Circle circle=new Circle(2);
        ComprableCircle comprableCircle[]=new ComprableCircle[3];
        comprableCircle[0]=new ComprableCircle(9);
        comprableCircle[1]=new ComprableCircle(3.7);
        comprableCircle[2]=new ComprableCircle(6,"green");
        for (ComprableCircle comprableCircle1:comprableCircle){
            System.out.println(comprableCircle1);
        }
        Arrays.sort(comprableCircle);
        System.out.println();
        for (ComprableCircle comprableCircle1:comprableCircle){
            System.out.println(comprableCircle1);
        }
    }
}
