package org.example;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @org.junit.jupiter.api.Test
    void triangleClassifier() {
        double a = 3;
        double b = 3;
        double c = 3;
        String actual = TriangleClassifier.classifyTriangle(a,b,c);
        String expected = "tam giác cân";
        assertEquals(actual,expected);
    }
}