package com.company;

import javax.swing.*;

public class SimpleAnimation {

    int x = 70;
    int y = 70;

    public static void main(String[] args) {
        SimpleAnimation gui = new SimpleAnimation();
        gui.go();
    }

    public void go(){
        JFrame jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyDrawPanel drawPanel = new MyDrawPanel();

        jFrame.getContentPane().add(drawPanel);
        jFrame.setSize(300,300);
        jFrame.setVisible(true);

        for (int i=0; i < 130; i++) {
            x++;
            y++;

            drawPanel.repaint();

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
