package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        ReverseWithStack.reverseWithStackNumber(arr);
        System.out.println(Arrays.toString(arr));

        String str="hello";
        System.out.println(str);
        System.out.println(ReverseWithStack.reverseWithStackString(str));
    }
}