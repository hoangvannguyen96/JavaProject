package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        char character='u';
        String str="code gym thua thien hue";
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==character){
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của ký tự "+character+" trong chuỗi là "+count+" lần");

    }
}