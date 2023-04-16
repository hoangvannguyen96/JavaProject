package org.example;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "ha");
        Student student2 = new Student(2, "hoa");
        Student student3 = new Student(3, "hoang");
        Student.change();
        student1.display();
        student2.display();
        student3.display();
    }
}


