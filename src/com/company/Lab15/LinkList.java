package com.company.Lab15;

import java.util.LinkedList;
    public class LinkList {

        public void test() {
            LinkedList<String> name = new LinkedList<>();
            System.out.println("Добавим имена в коллекцию");
           name.add("Иван");
            name.add("Петя");
            name.add("Вася");
            int size = name.size();
            System.out.println("Полученный размер: " + size);
            boolean check = name.isEmpty();
            if (check == false) {
                System.out.println("Список не пустой");
            } else {
                System.out.println("Список пустой");
            }
            name.addLast("Викто Викторович");

            System.out.println(name);
        }
    }
