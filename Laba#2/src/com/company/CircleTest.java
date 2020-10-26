package com.company;

public class CircleTest {
    public static void main(String[] args)
    {
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(10);
        Circle c3 = new Circle();

        c1.result();

        c2.Setrad(1);
        c3.Setd(20);

        c2.result();
        c3.result();

    }
}
