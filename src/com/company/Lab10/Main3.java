package com.company.Lab10;

import java.util.ArrayList;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int p;
        int flag = 0;
        Scanner sc = new Scanner(System.in);
        while ((p = sc.nextInt()) != 0)
        {
            if (flag == 0)
                arrayList.add(p);
            flag = (flag == 0) ? 1 : 0;
        }
        System.out.println(arrayList);
    }
}

