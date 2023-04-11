package org.example;

import java.util.Arrays;
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
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("số không có trong mảng");
        } else {
            for (; index < array.length - 1; index++) {
                array[index] = array[index + 1];
            }
            array = Arrays.copyOf(array, array.length - 1);
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }
}

