package com.company;

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playMP4(MediaFile mp4) {

    }

    @Override
    public void playFLV(MediaFile flv) {

    }

    @Override
    public void playVLC(MediaFile vlc) {
        System.out.println("Playing " + vlc.getName() + ".vlc   Size: " + vlc.getSize() + "MB  Duration: " + vlc.getDuration() + " min");
    }
}
