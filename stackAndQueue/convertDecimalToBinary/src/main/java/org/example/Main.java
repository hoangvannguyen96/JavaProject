package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập số cần chuyển đổi");
        int num=sc.nextInt();
        System.out.println(MyStack.decimalToBinary(num));
    }
}