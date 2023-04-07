package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập năm?");
        int year = scanner.nextInt();
        if (year % 4 != 0) {
            System.out.println(year + " không phải năm nhuận");
        } else if (year % 100 != 0) {
            System.out.println(year + " là năm nhuận");
        } else if (year % 400 == 0) {
            System.out.println(year + " là năm nhuận");
        } else {
            System.out.println(year + " không phải năm nhuận");
        }
    }
}