package com.company;

import javax.swing.*;
import java.awt.*;

public class Animation {

    JFrame frame;
    DrawPanel drawPanel;

    private int oneX = 10;
    private int oneY = 10;

    boolean up = false;
    boolean down = true;
    boolean left = false;
    boolean right = true;

    void app() {
        frame = new JFrame("Lab5");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        drawPanel = new DrawPanel();

        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);

        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        MoveFunc();
    }

    class DrawPanel extends JPanel {
        public void paintComponent(Graphics g) {
            g.setColor(Color.black);
            g.fillRect(0, 0, this.getWidth(), this.getHeight());
            g.setColor(Color.yellow);
            g.fillRect(oneX, oneY, 20, 20);
            g.setColor(Color.blue);
            g.fillRect(oneX, 9, 20, 20);
            g.setColor(Color.red);
            g.fillRect(9, oneY, 20, 20);
        }
    }

    private void MoveFunc() {
        while(true){
            if(oneX >= 280){
                right = false;
                left = true;
            }
            if(oneX <= 2){
                right = true;
                left = false;
            }
            if(oneY >= 255){
                up = true;
                down = false;
            }
            if(oneY <= 2){
                up = false;
                down = true;
            }
            if(up){
                oneY--;
            }
            if(down){
                oneY++;
            }
            if(left){
                oneX--;
            }
            if(right){
                oneX++;
            }
            try{
                Thread.sleep(10);
            }
            catch (Exception exc){
                exc.printStackTrace();
            }
            frame.repaint();
        }
    }
}

