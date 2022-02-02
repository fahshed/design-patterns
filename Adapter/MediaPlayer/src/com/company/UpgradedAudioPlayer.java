package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UpgradedAudioPlayer implements SimpleMediaPlayer {
    private List<MediaFile> playlist;

    private AdvancedMediaPlayer videoPlayer;

    public UpgradedAudioPlayer() {
        playlist = new ArrayList<>();
    }

    @Override
    public void play(MediaFile media) {
        if(media.getType().equalsIgnoreCase("mp3")) {
            System.out.println("Playing " + media.getName() + ".mp3   Size: " + media.getSize() + "MB  Duration: " + media.getDuration() + " min");
        }
        else {
            if(media.getType().equalsIgnoreCase("mp4")) {
                videoPlayer = new Mp4Player();
                videoPlayer.playMP4(media);
            }
            else if(media.getType().equalsIgnoreCase("flv")) {
                videoPlayer = new FlvPlayer();
                videoPlayer.playFLV(media);
            }
            else if(media.getType().equalsIgnoreCase("vlc")) {
                videoPlayer = new VlcPlayer();
                videoPlayer.playVLC(media);
            }
        }
    }

    public void addToPlayList(String fileName, float size, float duration) {
        playlist.add(new MediaFile(fileName, size, duration));
        System.out.println("Added to Playlist");
    }

    public void displayPlayList() {
        System.out.println("Current Playlist:");
        for(MediaFile media: playlist) {
            this.play(media);
        }
    }

    public void makePlaylist(float elapsedTime) {
        Scanner input = new Scanner(System.in);

        float totalDuration = 0;
        for(MediaFile media: playlist) {
            totalDuration += media.getDuration();
        }

        if(elapsedTime>totalDuration) {
            playlist.clear();

            String fileName;
            float size;
            float duration;

            while(true) {
                System.out.println("1.Add song\n2.Done Adding");
                if(input.nextInt()==2) {
                    break;
                }

                System.out.println("File name: ");
                fileName = input.next();
                System.out.println("File size: ");
                size = input.nextFloat();
                System.out.println("File duration: ");
                duration = input.nextFloat();

                this.addToPlayList(fileName, size, duration);
            }

            this.displayPlayList();
        }
        else {
            System.out.println("Currently playing a list");
            this.displayPlayList();
        }
    }
}
