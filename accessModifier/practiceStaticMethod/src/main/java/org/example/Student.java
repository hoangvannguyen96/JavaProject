package org.example;

public class Student {
    private int numerical;
    private String name;
    private static String college = "Hello world!";

    Student(int num, String n) {
        numerical = num;
        name = n;
    }
//    Student(int numerical, String name) {     //nếu tham chiếu trùng tên thuộc tính thì nhớ thêm "this"
//        this.numerical = numerical;
//        this.name = name;
//    }

    static void change() {
        college = "hello everyone";
    }

    void display() {
        System.out.println(numerical + " " + name + " " + college);
    }
}

