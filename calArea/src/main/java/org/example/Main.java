package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chiều rộng");
        float width = scanner.nextFloat();
        System.out.println("nhập chiều dài");
        float height = scanner.nextFloat();
        System.out.println("Diện tích là: " + width * height);
    }
}