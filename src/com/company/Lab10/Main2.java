package com.company.Lab10;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int p;
        int counter = 0;
        Scanner sc = new Scanner(System.in);
        while ((p = sc.nextInt()) != 0)
        {
            if (p % 2 != 0)
                arrayList.add(p);
        }
        System.out.println(arrayList);
    }
}

