package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập chuỗi?");
        String str=sc.nextLine();
        char string []=str.toCharArray();
        String result=String.valueOf(string[0]); //ép kiểu ký tự thành chuỗi
        for(int i=0;i<string.length-1;i++){
            if ((int)string[i]<(int)string[i+1]){
                result+=string[i+1];
            }
        }
        System.out.println(result);
    }
}