package com.company;

public class Dog implements Nameable {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public void getName() {
        System.out.println("Имя собаки: "+name);
    }
}