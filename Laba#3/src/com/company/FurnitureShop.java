package com.company;

public class FurnitureShop {

    public static void main(String[] args) {
	Chair c1 = new Chair(4300,"Маленький", "Желтый");
	Chair c2 = new Chair(2850,"Маленький", "Синий");
	c1.displayInfo();
	c2.displayInfo();
	Bed b1 = new Bed(25000,"Крупный","Белая");
	b1.displayInfo();
	Cupboard cup1 = new Cupboard(17000," Очень крупный","Коричневый");
	cup1.displayInfo();
    }
}
