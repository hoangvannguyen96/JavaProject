package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số a?");
        int a = sc.nextInt();
        System.out.println("Nhập số b?");
        int b = sc.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 && b == 0) {
            System.out.println("Hai số " + a + " và " + b + " không có ƯCLN");
        } else {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            System.out.println("ƯCLN của 2 số " + a + " và " + b + " là: " + a);
        }
    }
}