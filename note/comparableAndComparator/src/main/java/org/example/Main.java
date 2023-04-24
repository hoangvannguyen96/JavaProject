package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(3, 6);
        Rectangle rectangle2 = new Rectangle(3, 4);
        Rectangle rectangle3 = new Rectangle(2, 4);
        Rectangle rectangle4 = new Rectangle(1, 1);
        Rectangle arr[] = new Rectangle[4];
        arr[0] = rectangle1;
        arr[1] = rectangle2;
        arr[2] = rectangle3;
        arr[3] = rectangle4;
        Arrays.sort(arr);
        for (Rectangle rec : arr) {
            System.out.println(rec.toString());
        }

        ComparatorArea comparator = new ComparatorArea();
        Arrays.sort(arr, comparator);
        System.out.println(Arrays.toString(arr));

        ComparatorPerimeter comparatorPerimeter = new ComparatorPerimeter();
        Arrays.sort(arr, comparatorPerimeter);
        System.out.println(Arrays.toString(arr));
    }
}