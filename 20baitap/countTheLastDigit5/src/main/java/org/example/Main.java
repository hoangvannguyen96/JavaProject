package org.example;

public class Main {
    public static void main(String[] args) {
        int arr []={1,24,34,127,134,23,54,46,80};
        int count=0;
        boolean check=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%10==5){
                count++;
                check=true;
            }
        }
        if(check){
            System.out.printf("có %d số trong mảng có chữ số tận cùng bằng 5",count);
        }else {
            System.out.println("không có phần tử nào trong mảng có chữ số tận cùng bằng 5");
        }
    }
}