package mirea;

import mirea.Shape;

public class Square extends Shape {

    private double B;

    public Square(double B, String color)
    {
        this.B = B;
        this.color = color;
    }

    @Override
    public double Perimeter() {
        P = B*4;
        return P;
    }

    @Override
    public double Area() {
        S = B * B;
        return S;
    }
    public String toString()
    {
        return "color "+color+"; P="+P+"; S="+S;
    }

}
