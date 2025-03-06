package org.example;

public class AreaOfATriangle {
    public double calculation(double firstSide, double secondSide, double thirdSide) {
        if (firstSide <= 0 || secondSide <= 0 || thirdSide <= 0) {
            throw new IllegalArgumentException("Стороны должны быть натуральными числами!");
        }
        double perimeter = firstSide + secondSide + thirdSide;
        double s = perimeter / 2;
        return Math.sqrt(s * (s - firstSide) * (s - secondSide) * (s - thirdSide));
    }
}