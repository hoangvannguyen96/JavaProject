package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập cân nặng ?kg");
        float weight = scanner.nextFloat();
        System.out.println("nhập chiều cao ?m");
        float height = scanner.nextFloat();
        double BMI = weight / (height * height);
        if (BMI < 18.5) {
            System.out.println("you underweight");
        } else if (BMI < 25) {
            System.out.println("you normal");
        } else if (BMI < 30) {
            System.out.println("you overweight");
        } else {
            System.out.println("you obese");
        }
    }
}