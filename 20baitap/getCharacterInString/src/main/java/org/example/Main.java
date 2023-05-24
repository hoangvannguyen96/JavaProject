package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhập số muốn lấy ký tự?");
        String num=scanner.nextLine();
        String str="HelloWord";
        Map<Character,Character> getString= new HashMap<>();
        getString.put('0','H');
        getString.put('1','e');
        getString.put('2','l');
        getString.put('3','l');
        getString.put('4','o');
        getString.put('5','W');
        getString.put('6','o');
        getString.put('7','r');
        getString.put('8','l');
        getString.put('9','d');
        String result="";
        for(int i=0;i<num.length();i++){
            Character digit=num.charAt(i);
            if(getString.containsKey(digit)){
                result+=getString.get(digit);
            }else {
                return;
            }
        }
        System.out.println(result);
    }
}