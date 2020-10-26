package com.company;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Маруся");
        cat1.getName();
        Cat cat2 = new Cat("Пушок");
        cat2.getName();
        Dog dog1 = new Dog("Шарик");
        dog1.getName();
        Dog dog2 = new Dog("Бобик");
        dog2.getName();
        Car car1 = new Car(2500000);
        car1.getPrice();
        Car car2 = new Car(300000);
        car2.getPrice();
    }
}
