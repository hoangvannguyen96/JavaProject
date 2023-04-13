package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr[] = {0, 4, 11, 135, 137, 34, 73, 27};
        boolean checkall=false;
        System.out.println("các số toàn lẻ là: ");
        for (int i = 0; i < arr.length; i++) {
            int temp=arr[i];
            boolean check = true;
            while (temp > 0) {
                int num = temp % 10;
                if (num % 2 == 0) {
                    check = false;
                    break;
                }
                temp /= 10;
            }
            if(check){
                System.out.print(arr[i]+" ");
                checkall=true;
            }
        }
        if(!checkall){
            System.out.println("không có giá trị nào toàn lẻ");
        }
    }
}

