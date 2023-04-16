package org.example;

public class Main {
    public static void main(String[] args) {
        Car car1=new Car("honda","xanh");
        System.out.println(Car.numberOfCar);
        Car car2=new Car("toyota","đỏ");
        System.out.println(Car.numberOfCar);
        Car car3=new Car("BMW","xanh dương");
        System.out.println(Car.numberOfCar);
    }
}
