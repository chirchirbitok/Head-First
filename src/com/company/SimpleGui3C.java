package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGui3C implements ActionListener {
    JFrame jFrame;

    public static void main(String[] args) {
        SimpleGui3C gui3C = new SimpleGui3C();
        gui3C.go();
    }

    private void go() {
        jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Change colors");
        button.addActionListener(this);

        MyDrawPanel drawPanel1 = new MyDrawPanel();

        jFrame.getContentPane().add(BorderLayout.SOUTH, button);
        jFrame.getContentPane().add(BorderLayout.CENTER, drawPanel1);
        jFrame.setSize(300,300);
        jFrame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        jFrame.repaint();
    }


}
