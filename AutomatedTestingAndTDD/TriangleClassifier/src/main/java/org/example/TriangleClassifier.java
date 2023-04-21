package org.example;

public class TriangleClassifier {
    static String classifyTriangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return "Độ dài cạnh của 1 tam giác là số dương";
        } else if (a >= b + c || b >= a + c || c >= a + b) {
            return "Không thể hình thành tam giác";
        } else {
            if (a == b && b == c && a != c) {
                return "tam giác cân";
            } else if (a == b&& b == c && a == c) {
                return "tam giác cân";
            } else {
                return "tam giác thường";
            }
        }
    }
}
