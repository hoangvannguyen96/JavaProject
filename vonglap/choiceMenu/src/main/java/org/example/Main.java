package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice=-1;
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Triangle");
            System.out.println("2. Square");
            System.out.println("3. Rectangle");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn của bạn?");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("******");
                    System.out.println("******");
                    System.out.println("******");
                    break;
                case 3:
                    System.out.println("*********");
                    System.out.println("*********");
                    System.out.println("*********");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn nằm ngoài Menu - Mời nhập lại?");
            }
        }
    }
}