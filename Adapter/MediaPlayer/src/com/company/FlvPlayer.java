package com.company;

public class FlvPlayer implements AdvancedMediaPlayer {
    @Override
    public void playMP4(MediaFile mp4) {

    }

    @Override
    public void playFLV(MediaFile flv) {
        System.out.println("Playing " + flv.getName() + ".flv   Size: " + flv.getSize() + "MB  Duration: " + flv.getDuration() + " min");
    }

    @Override
    public void playVLC(MediaFile vlc) {

    }
}
