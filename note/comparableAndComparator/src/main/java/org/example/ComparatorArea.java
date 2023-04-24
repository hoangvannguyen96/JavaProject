package org.example;

import java.util.Comparator;

public class ComparatorArea implements Comparator<Rectangle> {
    @Override
    public int compare(Rectangle o1, Rectangle o2) {
        return (int) (o1.getArea() - o2.getArea());
    }
}

