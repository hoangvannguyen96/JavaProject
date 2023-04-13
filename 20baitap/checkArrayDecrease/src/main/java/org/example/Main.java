package org.example;

public class Main {
    public static void main(String[] args) {
        int arr []={67,54,43,11,6,94,97};
        boolean check=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                check=false;
                break;
            }
        }
        if(check){
            System.out.println("mảng có tính chất giảm dần");
        }else {
            System.out.println("mảng không có tính chất giảm dần");
        }
    }
}