package mirea;

public abstract class Shape {
    protected double P;
    protected double S;
    protected String color;

    public abstract double Perimeter();
    public abstract double Area();

    public void SetColor(String A)
    {
        color = A;
    }
}
