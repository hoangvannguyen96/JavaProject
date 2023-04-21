package org.example;

public class FizzBuzz {
    static String fizzBuzz(int number) {
        if (number < 0) {
            return "số nhập vào phải lớn hơn 0";
        } else if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 5 == 0||readNum5(number)) {
            return "Buzz";
        } else if (number % 3 == 0||readNum3(number)) {
            return "Fizz";
        } else {
            return readNumber(number);
        }
    }
    public static boolean readNum3(int number){
        boolean check=false;
        String str=Integer.toString(number);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='3'){
                check=true;
                break;
            }
        }
        return check;
    }
    public static boolean readNum5(int number){
        boolean check=false;
        String str=Integer.toString(number);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='5'){
                check=true;
                break;
            }
        }
        return check;
    }

    public static String readNumber(int number) {
        String num[] = {"khong", "mot", "hai", "ba", "bon", "nam", "sau", "bay", "tam", "chin"};
        if(number<100){
            if(number<10){
                return num[number];
            }else {
                return num[number/10]+" "+num[number%10];
            }
        }else {
            return Integer.toString(number);
        }
    }
}