package com.company;

import javax.swing.plaf.synth.SynthLookAndFeel;

public class Hobbits {
    String name;

    public static void main(String [] args) {
        Hobbits[] h = new Hobbits[3];
        int z = 0;

        while (z<2){
            z = z + 1;
            h[z] =new Hobbits();
            h[z].name = "bilbo";
            if (z==1){
                h[z].name = "bilbo";
            }
            if (z==2){
                h[z].name = "frido";
            }
            System.out.print(h[z].name +  "is a");
            System.out.println("good Hobbit name");
            }

    }
}
