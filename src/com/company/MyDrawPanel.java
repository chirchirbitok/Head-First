package com.company;

import javax.swing.*;
import java.awt.*;

public class MyDrawPanel extends JPanel {


    public void paintComponent(Graphics graphics){
        graphics.setColor(Color.orange);
        graphics.fillRect(20,50,100,100);
    }

    public void paintComponents(Graphics g){
        Image image = new  ImageIcon("catzilla.jpg").getImage();
        g.drawImage(image,3,4,this);
    }

    public void paintComponentt(Graphics gra){
        gra.fillRect(0,0,this.getWidth(),this.getHeight());

        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);
    }

     public static void main(String[] args) {

    }
}
