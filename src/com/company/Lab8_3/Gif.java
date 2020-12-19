package com.company.Lab8_3;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Gif extends JPanel {
    static int x;
    int y;

    public void paintComponent(Graphics g) {
        ArrayList<String> list = new ArrayList<>();
        list.add("src/com/company/Lab8_3/1.png");
        list.add("src/com/company/Lab8_3/2.png");
        list.add("src/com/company/Lab8_3/3.png");
        g.setColor(Color.white);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        for (int i = 0; i < 3; i++) {
            String s = list.get(i);
            Image image = new ImageIcon(s).getImage();
            g.drawImage(image, x, y, Color.white, null);
            x = x + 105;
            y = 0;
            repaint();
            try {
                Thread.sleep(500);
            } catch (Exception ex) {
            }
        }
    }
}
