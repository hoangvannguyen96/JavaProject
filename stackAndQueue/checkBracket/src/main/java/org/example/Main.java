package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập biểu thức");
        String str=sc.nextLine();
        if(CheckBracket.checkBracket(str)){
            System.out.println("dùng dấu ngoặc đúng");
        }else {
            System.out.println("dùng dấu ngoặc sai");
        }
    }
}