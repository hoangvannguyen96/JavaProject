package org.example;

import java.util.List;
import java.util.Scanner;

import static org.example.FindMaxValue.findMax;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        System.out.println("Nhập đường dẫn file chứa số cần tìm");
        String fileread=sc.nextLine();
        List<Integer> numbers = readAndWriteFile.readFile(fileread);
        int maxValue = findMax(numbers);
        System.out.println("Nhập đường dẫn file muốn ghi vào");
        String filewrite=sc.nextLine();
        readAndWriteFile.writeFile(filewrite, maxValue);
    }
}