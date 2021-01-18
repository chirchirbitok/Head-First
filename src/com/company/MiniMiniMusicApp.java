package com.company;

import javax.sound.midi.*;

public class MiniMiniMusicApp {
    public static void main(String[] args){
        MiniMiniMusicApp mini = new MiniMiniMusicApp();
        mini.play();
    }

    private void play() {
        try{
            Sequencer player = MidiSystem.getSequencer();
            player.open();

            Sequence seq = new Sequence(Sequence.PPQ, 4);

            Track track = seq.createTrack();

            ShortMessage a = new ShortMessage();
            a.setMessage(192, 1,45, 100);
            MidiEvent noteOn = new MidiEvent(a, 10);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1,45, 100);
            MidiEvent noteOf = new MidiEvent(a, 10);
            track.add(noteOf);

            player.setSequence(seq);

            player.start();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

}
