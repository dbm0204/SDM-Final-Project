package com.example.bmathew2014.supportclasses;

public class Album {
    private String name;
    private int numOfSongs;
    private int thumbnails;

    public Album() {
    }

    public Album(String name, int numOfSongs, int thumbnails) {
        this.name = name;
        this.numOfSongs = numOfSongs;
        this.thumbnails = thumbnails;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfSongs() {
        return numOfSongs;
    }

    public void setNumOfSongs(int numOfSongs) {
        this.numOfSongs = numOfSongs;
    }

    public int getThumbnails() {
        return thumbnails;
    }

    public void setThumbnails(int thumbnails) {
        this.thumbnails = thumbnails;
    }
}
