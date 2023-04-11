package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = {1, 2, 3, 4, 5};
        System.out.println("nhập phần tử cần chèn");
        int num = sc.nextInt();
        System.out.println("nhập vào vị trí cần chèn");
        int index = sc.nextInt();
        if (index < 0 || index > array.length-1) {
            System.out.println("không thể chèn phần tử vào mảng");
        } else {
            int newArray[] = new int[array.length + 1];
            for (int i = 0; i < index; i++) {
                newArray[i] = array[i];
            }
            newArray[index]=num;
            for(int i=index;i<newArray.length-1;i++){
                newArray[i+1]=array[i];
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}
}
