package com.company.Pr2;

public class Main {

    public static void main(String[] args) {
        com.company.Pr2.Shape a = new com.company.Pr2.Shape();
        a.length = 5;
        a.width = 10;
        a.toString();


        //last
        com.company.Pr2.Dog b = new com.company.Pr2.Dog();
        b.setAge(10);
        b.setName("Vanya");
        System.out.println(b.to_human());
        System.out.println(b.toString());
        com.company.Pr2.dog_nursery c = new com.company.Pr2.dog_nursery();
        c.add(b);

    }
}
