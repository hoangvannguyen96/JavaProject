package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập tên");
        String name=scanner.nextLine();
        System.out.println("hello "+name);
    }
}