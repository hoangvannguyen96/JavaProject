package org.example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {
    public static boolean isPalindrome(String str) {
        Stack stack=new Stack<>();
        Queue queue = new LinkedList();
        for (int i = 0;i<str.length();i++) {
            stack.push(str.charAt(i));
            queue.add(str.charAt(i));
        }
        boolean check=false;
        while (!stack.isEmpty()){
           if(stack.pop().equals(queue.remove())){
               check=true;
           }
        }
        return check;
    }
}
