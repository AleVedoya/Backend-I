package com.alevedoya;

public class Cancion {
    private  String name;
    private  String artist;
    private  String genre;

    public Cancion(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return name + '\'';
    }
}

