package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập chuỗi cần kiểm tra?");
        String str=sc.nextLine();
        if(Palindrome.isPalindrome(str)){
            System.out.println("chuỗi Palindrome");
        }else {
            System.out.println("không phải chuỗi Palindrome");
        }
    }
}