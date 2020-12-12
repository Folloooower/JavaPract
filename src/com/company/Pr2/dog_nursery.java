package com.company.Pr2;

public class dog_nursery {
    int place = 0;
    com.company.Pr2.Dog[]arr = new com.company.Pr2.Dog[10];

    public void add(com.company.Pr2.Dog dog)
    {
        arr[place] = dog;
        place++;
        System.out.println("succes");
    }
}
