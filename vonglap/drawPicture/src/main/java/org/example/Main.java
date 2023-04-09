package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int choice = -1;
        while (choice!=0){
            System.out.println("Menu");
            System.out.println("1. Rectangle");
            System.out.println("2. Tritangle botton left");
            System.out.println("3. Tritangle top left");
            System.out.println("4. Isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn của bạn?");
            choice=input.nextInt();
            switch (choice){
                case 1:
                    String draw="";
                    for(int i=0;i<5;i++){
                        for(int j=0;j<5;j++){
                            draw+="*";
                        }
                        draw+="\n";
                    }
                    System.out.println(draw);
                    break;
                case 2:
                    String draw1="";
                    for(int i=0;i<5;i++){
                        for(int j=0;j<=i;j++){
                            draw1+="*";
                        }
                        draw1+="\n";
                    }
                    System.out.println(draw1);
                    break;
                case 3:
                    String draw2="";
                    for(int i=0;i<5;i++){
                        for(int j=0;j<5-i;j++){
                            draw2+="*";
                        }
                        draw2+="\n";
                    }
                    System.out.println(draw2);
                    break;
                case 4:
                    String draw3="";
                    for(int i=0;i<5;i++){
                        for(int j=0;j<5-i;j++){
                            draw3+=" ";
                        }
                        for(int k=0;k<=i*2;k++){
                            draw3+="*";
                        }
                        draw3+="\n";
                    }
                    System.out.println(draw3);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn của bạn nằm ngoài Menu - Vui lòng nhập lại!");
            }
        }
    }
}