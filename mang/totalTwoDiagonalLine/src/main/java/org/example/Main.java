package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int arr[][]={
                {1,2,3,4},
                {5,8,7,8},
                {0,1,2,3},
                {6,3,4,5}
        };
        int sum1=0;
        int sum2=0;
        for(int i=0;i<arr.length;i++){
        sum1+=arr[i][i];
        sum2+=arr[i][arr.length-i-1];
        }
        System.out.println(sum1);
        System.out.println(sum2);
    }
}