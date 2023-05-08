package org.example;

public class Main {
    public static void main(String[] args) {
        ReadFile readFile = new ReadFile();
        String str = "E:\\JavaProject\\IOTextFile\\readCSV\\src\\main\\java\\org\\example\\file.csv";
        readFile.read(str);
    }
}