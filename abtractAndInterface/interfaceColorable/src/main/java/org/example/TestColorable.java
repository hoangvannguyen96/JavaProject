package org.example;

public class TestColorable {
    public static void main(String[] args) {
        Colorable colorable[]=new Colorable[2];
        colorable[0]=new Circle(2);
        colorable[1]=new Square(3);
        for(Colorable color:colorable){
            System.out.println(color.toString());
            if(color instanceof Square){
                System.out.println(color.howToColor());
            }
        }
    }
}
