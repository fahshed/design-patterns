package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        UpgradedAudioPlayer audioPlayer = new UpgradedAudioPlayer();

        int choice;
        while(true) {
            System.out.println("1.Make a playlist\n2.Add to playlist\n3.Display Playlist\n4.Quit");
            choice = input.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("Enter elapsed time:");
                    audioPlayer.makePlaylist(input.nextFloat());
                    break;
                case 2:
                    String fileName;
                    float size;
                    float duration;

                    System.out.println("File name: ");
                    fileName = input.next();
                    System.out.println("File size: ");
                    size = input.nextFloat();
                    System.out.println("File duration: ");
                    duration = input.nextFloat();
                    audioPlayer.addToPlayList(fileName, size, duration);
                    break;
                case 3:
                    audioPlayer.displayPlayList();
                    break;
                case 4:
                    break;
            }

            if(choice==4) {
                break;
            }

            System.out.println();
        }
    }
}
