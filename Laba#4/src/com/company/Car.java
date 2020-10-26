package com.company;

public class Car {
    private int price;

    public Car(int price) {
        this.price = price;
    }
    public void getPrice() { System.out.println("Цена машины: "+price); }
}
