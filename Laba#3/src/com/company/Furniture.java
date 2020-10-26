package com.company;

public abstract class Furniture {

    public int price;
    public String size;
    public String color;


    public int getPrice() { return price; }
    public String getSize() { return size; }
    public String getColor() { return color; }

    public void setPrice(int p) { price = p; }
    public void setSize(String s) { size = s; }
    public void setColor(String c) { color = c; }


    public Furniture(int p, String s, String c) {
        this.price = p;
        this.size = s;
        this.color = c;
    }
    public abstract void displayInfo();
}
