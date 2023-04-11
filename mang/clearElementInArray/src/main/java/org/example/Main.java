package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập cỡ mảng");
        int size = sc.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 20);
            System.out.print(array[i] + " ");
        }
        System.out.println("nhập phần tử cần xóa khỏi mảng?");
        int element = sc.nextInt();
        boolean check = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                for (int index = i; index < array.length - 1; index++) {
                    array[index] = array[index + 1];
                }
                check = true;
                break;
            }
        }
        if (check) {
            for (int i = 0; i < array.length - 1; i++) {
                System.out.print(array[i] + " ");
            }
        } else {
            System.out.println("số không có trong mảng");
        }
    }
}

