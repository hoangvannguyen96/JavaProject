package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 2;
        int count = 0;
        String result = "";
        while (count < 20) {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                result += n + " ";
                count++;
            }
            n++;
        }
        System.out.println(result);
    }
}