package com.aman.lab4.ex3;
public class CD extends MediaItem {

    private String artist;
    private String genre;

    public CD(int idNumber,
            String title,
            int numCopies,
            int runtime,
            String artist,
            String genre) {

        super(idNumber, title, numCopies, runtime);

        this.artist = artist;
        this.genre = genre;
    }

    @Override
    public String toString() {

        return "CD [" +
                super.toString() +
                ", artist=" + artist +
                ", genre=" + genre + "]";
    }
}