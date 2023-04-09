package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập $");
        double $=scanner.nextDouble();
        System.out.println($+" $="+$*23000+"VND");
    }
}