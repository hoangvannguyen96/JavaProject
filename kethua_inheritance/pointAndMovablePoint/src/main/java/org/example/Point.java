package org.example;
import java.util.Arrays;
public class Point {
    private float x=0.0f;
    private float y=0.0f;

    public Point() {
        this.x = 1;
        this.y = 1;
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x,float y){
        this.x=x;
        this.y=y;
    }
    public float [] getXY(){
        float xy []={x,y};
        return xy;
    }
    public String toString(){
        return Arrays.toString(getXY());
    }
}
