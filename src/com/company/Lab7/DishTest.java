package com.company.Lab7;

public class DishTest {
    public static void main (String[] args){
        Cup c= new Cup("Фарфор","белый",12);

        Spoon s = new Spoon("Серебро","silver",10);
        System.out.println("Материал : "+ c.getMaterial());
        s.takeFood();
        c.putFood();
        s.clean();
    }
}
