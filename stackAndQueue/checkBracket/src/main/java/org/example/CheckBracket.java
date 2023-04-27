package org.example;

import java.util.Stack;

public class CheckBracket {
    public static boolean checkBracket(String str){
        Stack stack=new Stack();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('){
                stack.push(str.charAt(i));
            }else if(str.charAt(i)==')'){
                if(stack.isEmpty()){
                    return false;
                }else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }

}
