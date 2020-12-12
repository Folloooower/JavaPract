package com.company.Lab7;

public  abstract class Dish {
    String material;
    String color;
    int food;

    public Dish(){

    }
    public Dish(String material, String color, int food){
        this.material=material;
        this.color=color;
        this.food=food;

    }
    public void setFood(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void clean(){
        System.out.println("Посуда помыта!");
    }
    public void use(){
        System.out.println("Вы взяли посуду");
    }
    public abstract void putFood();

}
