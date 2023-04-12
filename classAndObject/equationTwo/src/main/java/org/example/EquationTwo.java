package org.example;
public class EquationTwo {
    double a;
    double b;
    double c;

    public EquationTwo() {
    }

    public EquationTwo(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double delta() {
        return (this.b * this.b) - 4 * this.a * this.c;
    }

    public double getRoot1() {
        return (-this.b + Math.pow((this.b * this.b) - 4 * this.a * this.c, 0.5)) / (2 * this.a);
    }

    public double getRoot2() {
        return (-this.b - Math.pow((this.b * this.b) - 4 * this.a * this.c, 0.5)) / (2 * this.a);
    }

}
