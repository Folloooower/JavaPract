package com.company.Lab7;

public class Cup extends Dish {
    public Cup() {

    }

    public Cup(String material, String color, int food) {
        super(material, color, food);

    }

    public void putFood() {
        if (food != 0) {
            System.out.println("В чашке что-то есть");
        } else {
            System.out.println("В чашке ничего нет");
        }
    }
}