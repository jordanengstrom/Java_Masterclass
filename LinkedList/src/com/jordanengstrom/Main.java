package com.jordanengstrom;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create a program that implements a playlist for songs
        // Create a Song class having Title and Duration for a song.
        // The program will have an Album class containing a list of songs.
        // The albums will be stored in an ArrayList
        // Songs from different albums can be added to the playlist and will appear in the list in the order
        // they are added.
        // Once the songs have been added to the playlist, create a menu of options to:-
        // Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
        // List the songs in the playlist
        // A song must exist in an album before it can be added to the playlist (so you can only play songs that
        // you own).
        // Hint:  To replay a song, consider what happened when we went back and forth from a city before we
        // started tracking the direction we were going.
        // As an optional extra, provide an option to remove the current song from the playlist
        // (hint: listiterator.remove()
        Playlist playlist = new Playlist("Benny's playlist");

        Song imagine = new Song("Thank You Next", "imagine", 3.32);
        Song needy = new Song("Thank You Next", "needy", 2.52);
        Song NASA = new Song("Thank You Next", "NASA", 3.02);
        Song godIsAWoman = new Song("Sweetener", "God is a Woman", 3.16);
        Song everytime = new Song("Sweetener", "everytime", 2.51);
        Song breathin = new Song("Sweetener", "breathin", 3.21);
        Song beAlright = new Song("Dangerous Woman", "Be Alright", 2.88);
        Song intoYou = new Song("Dangerous Woman", "Into You", 4.04);
        Song letMeLoveU = new Song("Dangerous Woman", "Let Me Love You", 3.51);

        Album ThankYouNext = new Album("Thank You Next");
        Album Sweetener = new Album("Sweetener");
        Album DangerousWoman = new Album("Dangerous Woman");

        ThankYouNext.addSong(imagine);
        ThankYouNext.addSong(needy);
        ThankYouNext.addSong(NASA);

        Sweetener.addSong(godIsAWoman);
        Sweetener.addSong(everytime);
        Sweetener.addSong(breathin);

        DangerousWoman.addSong(beAlright);
        DangerousWoman.addSong(intoYou);
        DangerousWoman.addSong(letMeLoveU);

        playlist.addAlbum(ThankYouNext);
        playlist.addAlbum(Sweetener);
        playlist.addAlbum(DangerousWoman);

        playlist.addSong(letMeLoveU);
        playlist.addSong(needy);
        playlist.addSong(godIsAWoman);

        playlist.getSongs();
        goThroughSongs(playlist.getSongList(), playlist);

    }

    public static void goThroughSongs(LinkedList songs, Playlist playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean playing = true;
        boolean goingForward = true;

        ListIterator<Song> listIterator = songs.listIterator();

        if (playlist.getSongList().isEmpty()) {
            System.out.println("No songs in playlist\n");
            return;
        } else {
            System.out.println("Now playing: " + listIterator.next().getTitle() + "\n");
            playlist.printPlaylistMenu();
        }

        while (playing) {
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }

                    if (listIterator.hasNext()) {
                        System.out.println("Now playing: " + listIterator.next().getTitle() + "\n");
                    } else {
                        System.out.println("End of playlist\n");
                        goingForward = false;
                    }
                    playlist.printPlaylistMenu();
                    break;
                    // my code before:
//                    if (listIterator.hasNext()) {
//                        System.out.println("Now playing: " + listIterator.next().getTitle());
//                        playlist.printPlaylistMenu();
//                    } else {
//                        System.out.println("End of playlist");
//                        playlist.printPlaylistMenu();
//                    }
//                    break;
                case 2:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }

                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing: " + listIterator.previous().getTitle() + "\n");
                    } else {
                        System.out.println("Beginning of playlist\n");
                        goingForward = true;
                    }
                    playlist.printPlaylistMenu();
                    break;
                    // my code before:
//                    if (listIterator.hasPrevious()) {
//                        System.out.println("Now playing: " + listIterator.next().getTitle());
//                        playlist.printPlaylistMenu();
//                    } else {
//                        System.out.println("Beginning of playlist");
//                    }
//                    break;
                case 3:
                    System.out.println("Removed song");
                    listIterator.remove();
                    listIterator.next();
                    playlist.getSongs();
                    playlist.printPlaylistMenu();
                    break;
                case 4:
                    System.out.println("\nThanks for rocking out with me!");
                    playing = false;
                    break;
                default:
                    break;
            }
        }
    }
}
