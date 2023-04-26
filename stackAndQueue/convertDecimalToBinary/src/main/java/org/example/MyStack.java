package org.example;

import java.util.Stack;

public class MyStack {

    public static String decimalToBinary(int num) {
        Stack<String> stack = new Stack<>();

        while (num>0) {
            stack.push(String.valueOf(num % 2));
            num/=2;
        }
        if (stack.isEmpty()) {
            return "không chuyển đổi được, bạn phải nhập vào số lớn hơn 0";
        }
        String str="";
        while (!stack.isEmpty()){
            str+=stack.pop();
        }
        return str;
    }
}
