package com.company;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;

public class MusicTest1 {

    public void play(){
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        }
        System.out.println("We go a sequencer");
    }//close play

    public static void main(String[] args){
        MusicTest1 mt = new MusicTest1();
        mt.play();
    }
}
