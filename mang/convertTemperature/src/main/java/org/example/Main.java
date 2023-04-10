package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        double oF;
        double oC;
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Convert 0F to 0C");
            System.out.println("2. Convert 0C to 0F");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn?");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập 0F?");
                    double F = sc.nextDouble();
                    System.out.println(F + " oF bằng " + oF(F) + " oC");
                    break;
                case 2:
                    System.out.println("Nhập 0C?");
                    double C = sc.nextDouble();
                    System.out.println(C + " oC bằng " + oC(C) + " oF");
                    break;
                default:
                    System.out.println("Lựa chọn của bạn không nằm trong Menu");
            }
        }
    }

    public static double oF(double F) {
        double oC;
        System.out.println("Of");
        oC = (5.0 * (F - 32.0)) / 9.0;
        return oC;
    }

    public static double oC(double C) {
        double oF;
        oF = ((9.0 * C) / 5.0) + 32.0;
        return oF;
    }
}