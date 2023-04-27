package org.example;

import java.util.Comparator;

public class ComparatorName implements Comparator<Shape> {
    @Override
    public int compare(Shape o1,Shape o2){
        return o1.getClass().getName().compareTo(o2.getClass().getName());
    }
}
