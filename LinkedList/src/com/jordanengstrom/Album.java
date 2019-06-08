package com.jordanengstrom;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private LinkedList<Song> songs;

    public Album(String name) {
        this.name = name;
        this.songs = new LinkedList<Song>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LinkedList<Song> getSongs() {
        return songs;
    }

    public void addSong(Song s) {
        songs.add(s);
    }
}
