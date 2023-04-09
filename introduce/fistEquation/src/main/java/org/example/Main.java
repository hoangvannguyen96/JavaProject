package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập số a?");
        double a=scanner.nextDouble();
        System.out.println("nhập số b?");
        double b=scanner.nextDouble();
        if(a!=0){
            System.out.println("phương trình có nghiệm: "+-b/a);
        }else if(b==0){
            System.out.println("phương trình có vô số nghiệm");
        }else{
            System.out.println("phương trình vô nghiệm");
        }
    }
}