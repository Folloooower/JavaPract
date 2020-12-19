package com.company.Lab15;

import java.util.ArrayList;
public class ArrList {

    public ArrList() {

    }
    public void test() {
        ArrayList<Integer> myList = new ArrayList();
        System.out.println("Добавим числа в коллекцию");
        myList.add(2);
        myList.add(4);
        int size = myList.size();
        System.out.println("Полученный размер: " + size);
        boolean check = myList.isEmpty();
        if (check == false) {
            System.out.println("Список не пустой");
        } else {
            System.out.println("Список пустой");
        }
        System.out.println(myList.get(0));
        System.out.println(myList);
    }
}
