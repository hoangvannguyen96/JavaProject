package org.example;

public class TestStudent {
    public static void main(String[] args) {
        Student student1=new Student();
        Student student2=new Student();
        student1.setName("henry");
        student1.setClasses("co3");
        student1.setName("mike");
        student1.setClasses("co4");
        student1.display();
        student2.display();
    }
}
