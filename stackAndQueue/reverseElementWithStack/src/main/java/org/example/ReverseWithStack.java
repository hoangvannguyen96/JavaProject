package org.example;

import java.util.Stack;

public class ReverseWithStack {
    public static void reverseWithStackNumber(int arr[]) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
    }

    public static String reverseWithStackString(String str) {
        char arr[] = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i]=stack.pop();
        }
        return new String(arr);
    }
}

