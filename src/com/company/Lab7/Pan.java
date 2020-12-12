package com.company.Lab7;

public class Pan extends Dish implements ToCook {
    public Pan() {

    }

    public Pan(String material, String color, int food) {
        super(material, color, food);
    }

    public void goCook() {
        if (food != 0) {
            food++;
            System.out.println("Ура теперь еды: " + food);
        } else {
            System.out.println("Еда не прибавляется");
        }
    }

    public void putFood() {
        if (food != 0) {
            System.out.println("На cковороде есть еда");
        } else {
            System.out.println("Еды нет");
        }
    }
}