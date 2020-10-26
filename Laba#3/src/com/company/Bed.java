package com.company;

class Bed extends Furniture{
    public String name = "Кровать";

    public Bed(int price, String size, String color) {
        super(price, size, color);
    }
    public void displayInfo(){
        System.out.println(" Название: " + name + " | Размер: " + super.getSize() + " | Цвет: " + super.getColor() +  " | Цена: " + super.getPrice());
    }
}