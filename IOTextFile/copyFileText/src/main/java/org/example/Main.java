package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ReadAndWrite readAndWrite =new ReadAndWrite();
        System.out.println("Nhập địa chỉ file nguồn?");
        String source=sc.nextLine();
        System.out.println("Nhập địa chỉ file đích?");
        String destination=sc.nextLine();
        readAndWrite.write(destination,source);
    }
}