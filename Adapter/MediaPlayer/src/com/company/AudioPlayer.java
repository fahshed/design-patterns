package com.company;

public class AudioPlayer implements SimpleMediaPlayer {
    @Override
    public void play(MediaFile media) {
        System.out.println("Playing " + media.getName() + ".flv   Size: " + media.getSize() + "MB  Duration: " + media.getDuration() + " min");
    }
}
