package org.example;

public class TestAreAfterChangeResizeable {
    public static void main(String[] args) {
        Resizeable resizeables[] = new Resizeable[3];
        resizeables[0] = new Circle(2);
        resizeables[1] = new Rectangle(3, 4);
        resizeables[2] = new Square(5);
        for (Resizeable resize : resizeables) {
            System.out.println("Ban đầu "+ resize.toString());
            double percent=Math.ceil(Math.random() *((100-1+1)+1));
            resize.resizeable(percent);
            System.out.println("Sau khi tăng kích thước lên " + percent + " % thì " + resize.toString());
        }
    }
}
