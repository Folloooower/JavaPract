package com.company.Lab7;

public class Plate extends Dish{
    public Plate(){

    }
    public Plate(String material, String color,int food){
        super(material, color, food);
    }
    public void putFood(){
        if(food!=0){
            System.out.println("На тарелке есть еда");
        }
        else{
            System.out.println("Еды нет");
        }
        
    }
}
