package com.company;

public class Calculation {
    public double D;
    public double x1, x2, x;
    public void calculation(double a, double b, double c) {
        D = b * b - 4 * a * c;
        if (D > 0) {
            double d = Math.sqrt(D);
            x1 = (-b-d)/(2 * a);
            x2 = (-b+d)/(2 * a);
            //System.out.println(x1 + " " + x2);
        }
        if (D == 0) {
            x = (-b)/(2 * a);
            //System.out.println(x);
        }
    }
    public double getX1() {
        return x1;
    }
    public double getX2() {
        return x2;
    }
    public double getX() {
        return x;
    }
}
