package com.company;

class Cupboard extends Furniture{
    public String name = "Шкаф";

    public Cupboard(int price, String size, String color) {
        super(price, size, color);
    }
    public void displayInfo(){
        System.out.println(" Название: " + name + " | Размер: " + super.getSize() + " | Цвет: " + super.getColor() +  " | Цена: " + super.getPrice());
    }
}