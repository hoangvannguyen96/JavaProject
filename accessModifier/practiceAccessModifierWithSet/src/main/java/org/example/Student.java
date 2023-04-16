package org.example;

public class Student {
    private String name="john";
    private String classes="co2";
    public Student(){
    }
    public Student(String name,String classes){
        this.name=name;
        this.classes=classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
    public void display(){
        System.out.println(name+" "+classes);
    }
}
