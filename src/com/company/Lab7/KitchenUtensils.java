package com.company.Lab7;

public class KitchenUtensils extends Dish {
    public void takeFood(){
        if(food!=0){
            food--;
            System.out.println("Осталось "+food);
        }
        else{
            System.out.println("Еды нет, брать нечего :( ");

        }
    }
    public void putFood(){
        if(food!=0){
            System.out.println("есть еда");
        }
        else{System.out.println("Еды нет");}
    }
}
