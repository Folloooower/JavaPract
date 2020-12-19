package com.company.Lab10;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        int flag = 0;
        int p;
        int counter = 0;
        Scanner sc = new Scanner(System.in);
        while (!((p = sc.nextInt()) == 0 && flag != 0))
        {
            if (p == 1)
                counter++;
            if (p == 0)
                flag = 1;
            if (flag == 1 && p != 0)
                flag = 0;
        }
        System.out.println(counter);
    }
}
