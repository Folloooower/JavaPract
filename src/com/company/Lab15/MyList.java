package com.company.Lab15;

import com.company.Lab5.Circle;

import java.util.ArrayList;

public class MyList {

    public void go() {
        ArrayList<Circle> myList = new ArrayList();
        System.out.println("Добавим круги в список");
        myList.add(new Circle(1));
        myList.add(new Circle(2));
        myList.add(new Circle(1));

        int size = myList.size();
        System.out.println("Количество кругов: " + size);
        boolean check = myList.isEmpty();
        if (check == false) {
            System.out.println("Список не пустой");
        } else {
            System.out.println("Список пустой");
        }
        myList.remove(0);

        System.out.println(myList);
    }
}
