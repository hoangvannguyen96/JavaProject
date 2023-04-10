package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Nhập tên muốn tìm vị trí?");
        String name=input.nextLine();
        int index=0;
        String students[] = {"hai","hoa","hoang","ha","vy"};
        boolean check=false;
             for(int i=0;i<students.length;i++){
                 if(students[i].equals(name)){
                     index=i;
                     check=true;
                 }
             }
             if(check){
                 System.out.println("Bạn "+name+" ở vị trí "+index);
             }else {
                 System.out.println("Tên bạn vừa nhập không có trong mảng");
             }
    }
}