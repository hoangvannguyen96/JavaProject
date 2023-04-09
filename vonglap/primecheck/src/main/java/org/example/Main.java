package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần kiểm tra?");
        int num = scanner.nextInt();
        if (num < 2) {
            System.out.println("số " + num + " không là số nguyên tố");
        } else {
            boolean check = true;
            int i = 2;
            while (i <= Math.sqrt(num)) {
                if (num % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println("số " + num + " là số nguyên tố");
            } else {
                System.out.println("số " + num + " không là số nguyên tố");
            }
        }
    }
}