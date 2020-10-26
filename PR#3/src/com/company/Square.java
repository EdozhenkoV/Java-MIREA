package com.company;

public class Square extends Rectangle {
    protected double side;

    public Square() {}
    public Square(double side) {
        this.side = side;
    }
    public Square(double side, String color, boolean filled) {
        this.side = side;
    }
    public double getSide() { return side; }
    public void setSide() { this.side = side; }
    public void setWidth() {}
    public void setLength() {}
    @Override
    public String toString() { return "Shape: square, side: "+this.side; }
}
