package org.example;

public class Main {
    public static void main(String[] args) {
        Fan fan=new Fan();
        fan.setOn(true);
        System.out.println(fan.toString());
        Fan fan1=new Fan();
        System.out.println(fan1.toString());
    }
}
