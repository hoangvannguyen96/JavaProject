package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a?");
        double a = sc.nextDouble();
        System.out.println("Nhập b?");
        double b = sc.nextDouble();
        System.out.println("Nhập c?");
        double c = sc.nextDouble();
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("phương trình có vô số nghiệm");
                } else {
                    System.out.println("phương trình vô nghiệm");
                }
            } else {
                if (c != 0) {
                    System.out.println("phương trình có nghiệm là: " + -c / b);
                }
            }
        } else {
            EquationTwo equationTwo = new EquationTwo(a, b, c);
            if (equationTwo.delta() >= 0) {
                System.out.printf("phương trình có nghiệm x1 = %.3f và x2 = %.3f",equationTwo.getRoot1(),equationTwo.getRoot2());
            } else {
                System.out.println("phương trình vô nghiệm");
            }
        }
    }
}

