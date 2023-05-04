package org.example;

public class Triangle{
    double a,b,c;
    public Triangle(double a, double b, double c) throws TriangleException {
        if(a<=0|b<=0|c<=0){
            throw new TriangleException("cạnh phải là số dương");
        }
        if(a+b<=c|a+c<=b|b+c<=a){
            throw new TriangleException("tổng 2 cạnh phải lớn hơn 1 cạnh");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public String toString(){
        return a+" "+b+" "+c;
    }

}
