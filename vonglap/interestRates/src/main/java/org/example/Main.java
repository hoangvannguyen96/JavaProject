package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền cho vay?");
        double money=sc.nextDouble();
        System.out.println("Nhập số tháng gửi?");
        int month=sc.nextInt();
        System.out.println("Nhập lãi suất (%/năm)?");
        double interestRate=sc.nextDouble();
        double moneyCollected=0;
        for(int i=0;i<month;i++){
            moneyCollected+=money*(interestRate/100)/12*month;
        }
        System.out.println("Số tiền thu về sau khi cho vay "+month+" tháng là: "+moneyCollected);
    }
}