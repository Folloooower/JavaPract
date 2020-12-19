package com.company.Lab8;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Shapes extends JPanel {
    private List<Shape> shapes = new ArrayList<>();
    private Random random = new Random();
    private int width = 700, height = 700;

    public Shapes() {
        int i = 20;
        setPreferredSize(new Dimension(width, height));

        int mid = i / 2;
        for (int j = 0; j < mid; j++) {
            addCircle();
        }
        for (int j = mid; j < i; j++) {
            addRectangle();
        }

    }


    protected void paintComponent(Graphics g) {
        super.paintComponents(g);
        for (Shape s : shapes) { //Тут было Object
            if (s instanceof Oval) {
                ((Oval) s).draw(g);
            } else if (s instanceof Rectangle) {
                ((Rectangle) s).draw(g);
            }
        }
    }

    public void addCircle() {
        shapes.add(new Oval(random.nextInt(600), random.nextInt(600)));
        repaint();
    }

    public void addRectangle() {
        shapes.add(new Rectangle(random.nextInt(600), random.nextInt(600)));
        repaint();
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.add(new Shapes());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}

