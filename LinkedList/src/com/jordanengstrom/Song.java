package com.jordanengstrom;

public class Song {
    private String album;
    private String title;
    private double duration;

    public Song() {
        this.album = "";
        this.title = "";
        this.duration = 0.00;
    }

    public Song(String album, String title, double duration) {
        this.album = album;
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }


}
