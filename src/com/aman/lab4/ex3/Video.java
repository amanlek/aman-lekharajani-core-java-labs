package com.aman.lab4.ex3;

public class Video extends MediaItem {

    private String director;
    private String genre;
    private int yearReleased;

    public Video(int idNumber,
            String title,
            int numCopies,
            int runtime,
            String director,
            String genre,
            int yearReleased) {

        super(idNumber, title, numCopies, runtime);

        this.director = director;
        this.genre = genre;
        this.yearReleased = yearReleased;
    }

    @Override
    public String toString() {

        return "Video [" +
                super.toString() +
                ", director=" + director +
                ", genre=" + genre +
                ", yearReleased=" +
                yearReleased + "]";
    }
}