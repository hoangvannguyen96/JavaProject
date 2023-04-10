package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng");
        int size = sc.nextInt();
        int num[] = new int[size];
        int max = num[0];
        for (int i = 0; i < size; i++) {
            num[i] = (int) (Math.random() * 200);
            System.out.print(num[i] + " ");
            if (num[i] > max) {
                max = num[i];
            }
        }
        System.out.println("\n");
        System.out.println("Số lớn nhất trong mảng là: " + max);
    }
}