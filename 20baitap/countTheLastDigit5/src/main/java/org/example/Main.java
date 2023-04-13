package org.example;

public class Main {
    public static void main(String[] args) {
        int arr []={1,25,34,5,127,135,23,55,46,80};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%10==5){
                count++;
            }
        }
        System.out.printf("có %d số trong mảng có chữ số tận cùng bằng 5",count);
    }
}