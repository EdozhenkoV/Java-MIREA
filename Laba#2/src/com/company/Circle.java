package com.company;

public class Circle
{
    private double rad;
    private double d;
    private double dokr;
    public Circle(int a)
    {
        rad = a;
        d = rad*2;
        dokr = 6.28*rad;
    }
    public Circle()
    {
        rad = 1;
        d = rad*2;
        dokr = 6.28*rad;
    }
    public void Setrad(double rad)
    {
        this.rad = rad;//rad =j( double j)
        this.d = rad*2;
        this.dokr = 6.28*rad;

    }
    public void Setd(double d)
    {
        this.d = d; //b = d (double b) !!!super()!!!
        this.rad = d/2;
        this.dokr = rad*6.28;
    }
    public void Setdlok(double c)
    {
        this.dokr = c;
        this.rad = dokr/6.28;
        this.d = rad*2;
    }
    public void result()
    {
        String radf = String.format("%.2f", rad);
        String df = String.format("%.2f", d);
        String dokrf = String.format("%.2f", dokr);

        System.out.println ("Your circle :") ;
        System.out.println("rad ="+radf+"; d ="+df+"; dokr ="+dokrf);
    }
}
