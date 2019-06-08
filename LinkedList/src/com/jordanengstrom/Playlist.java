package com.jordanengstrom;

import java.util.ArrayList;
import java.util.LinkedList;

// Once the songs have been added to the playlist, create a menu of options to:-
// Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
// List the songs in the playlist
// A song must exist in an album before it can be added to the playlist (so you can only play songs that
// you own).
// Hint:  To replay a song, consider what happened when we went back and forth from a city before we
// started tracking the direction we were going.
// As an optional extra, provide an option to remove the current song from the playlist
// (hint: listiterator.remove()

public class Playlist {
    private String name;
    private ArrayList<Album> albums;
    private LinkedList<Song> songlist;


    public Playlist(String name) {
        this.name = name;
        this.albums = new ArrayList<Album>();
        this.songlist = new LinkedList<Song>();
    }

    public void printPlaylistMenu() {
        System.out.println("What would you like to do?");
        System.out.println("1. Fast forward >>");
        System.out.println("2. Go back <<");
        System.out.println("3. Remove current song");
        System.out.println("4. Quit\n");
    }

    public ArrayList<Album> getAblums() {
        return albums;
    }

    public String getName() {
        return name;
    }

    public void addAlbum(Album a) {
        albums.add(a);
    }

    public void addSong(Song s) {
        songlist.add(s);
    }

//    public Song getSong(Album a, String title) {
//        if (a.getSongs().size() > 0) {
//            for (int i = 0; i < a.getSongs().size(); i++) {
//                Song s = a.getSongs().get(i);
//                if (s.getTitle().equals(title)) {
//                    return s;
//                }
//            }
//        } else {
//            return new Song();
//        }
//    }

    public LinkedList getSongList() {
        return songlist;
    }

    public void getSongs() {
        System.out.println("PLAYLIST: " + this.name);
        System.out.println("------------------------------");
        for (int i = 0; i < songlist.size(); i++) {
            Song song = songlist.get(i);
            System.out.println("# " + (i + 1) + ". " + song.getTitle());
        }
        System.out.println("\n");
    }

//    public void getCurrentSong(String name) {
//        for (int i = 0; i < albums.size(); i++) {
//            Album a = albums.get(i);
//            for (int j = 0; j < a.getSongs().size(); j++) {
//                Song s = a.getSongs().get(j);
//                if (s.getTitle().equals(name)) {
//                    System.out.println(s.getTitle());
//                }
//            }
//        }
//    }

}
