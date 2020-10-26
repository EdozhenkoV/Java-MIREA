package com.company;

 public class Cat implements Nameable {
    private String name;
    public Cat(String name) {
        this.name = name;
    }
public void getName() { System.out.println("Имя кошки: "+name); }
}
