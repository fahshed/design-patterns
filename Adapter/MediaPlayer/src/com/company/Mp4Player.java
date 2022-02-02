package com.company;

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playMP4(MediaFile mp4) {
        System.out.println("Playing " + mp4.getName() + ".mp4   Size: " + mp4.getSize() + "MB  Duration: " + mp4.getDuration()  + " min");
    }

    @Override
    public void playFLV(MediaFile flv) {

    }

    @Override
    public void playVLC(MediaFile vlc) {

    }
}
