package org.example;

public class Main {
    public static void main(String[] args) {
        int arr[] = {1, 33, 4, 6, 50, 34, 10, 23};
        System.out.println(checkValue0(arr));
    }
    static int checkValue0(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                return 1;
            }
        }
        return 0;
    }
}