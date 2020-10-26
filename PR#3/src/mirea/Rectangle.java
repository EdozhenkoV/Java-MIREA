package mirea;

public class Rectangle extends Shape {

    private double B;
    private double C;
    public Rectangle( double B, double C, String color)
    {
        this.B = B;
        this.C = C;
        this.color = color;
    }


    public double Perimeter () {
        P = B*2 + C*2;
        return P;
    }


    public String toString()
    {
        return "color "+color+"; P="+P+"; S="+S;
    }
}
