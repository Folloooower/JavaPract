package com.company.Lab8;


import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.util.Random;

public class Oval extends Shape {
    int x, y;

    public Oval(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics g) {
        Graphics2D graphics2D = (Graphics2D) g;
        Ellipse2D.Double oval = new Ellipse2D.Double(x, y, 50, 50);
        int red = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        Color randomColor = new Color(red, green, blue);
        graphics2D.setColor(randomColor);
        graphics2D.fill(oval);
    }
}
