package com.company.Lab4;

public class Main {

    public static void main(String[] args) {
        // write your code here
        com.company.Lab4.Circle cr = new com.company.Lab4.Circle(2);
        Rectangle rc = new Rectangle(1, 2, "Red", true);
        com.company.Lab4.Square sq = new com.company.Lab4.Square(3);
        System.out.println(cr.toString());
        System.out.println(sq.toString());
        System.out.println(rc.toString());

    }
}
