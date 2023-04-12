package org.example;

public class Fan {
    public static final int slow = 1;
    public static final int medium = 2;
    public static final int fast = 3;
    private int speed;
    private double radius;
    private boolean on;
    private String color;

    public Fan() {
        this.speed = slow;
        this.radius = 5.0;
        this.on = false;
        this.color = "blue";
    }

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed){
        this.speed=speed;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public boolean getOn(){
        return on;
    }
    public void setOn(boolean on){
        this.on=on;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public String toString() {
        if (on==true) {
            return "Quạt đang bật với tốc độ là "+speed+", màu sắc là "+color+" và bán kính bằng "+radius;
        }else {
            return "Quạt đang tắt với màu sắc là "+color+" và bán kính bằng "+radius;
        }
    }
}
