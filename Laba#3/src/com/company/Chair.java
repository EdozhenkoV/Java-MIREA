package com.company;

class Chair extends Furniture{
    public String name = "Стул";

    public Chair(int price, String size, String color) {
        super(price, size, color);
    }
    public void displayInfo(){
        System.out.println(" Название: " + name + " | Размер: " + super.getSize() + " | Цвет: " + super.getColor() +  " | Цена: " + super.getPrice());
    }
}