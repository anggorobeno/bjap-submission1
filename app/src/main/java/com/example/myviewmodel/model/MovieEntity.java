package com.example.myviewmodel.model;

public class MovieEntity {
    private final String id;
    private final String title;
    private final String desc;
    private final int movieYear;
    private final int movieImage;

    public MovieEntity(String id, String title, String desc, int movieYear, int movieImage) {
        this.id = id;
        this.title = title;
        this.desc = desc;
        this.movieYear = movieYear;
        this.movieImage = movieImage;
    }

    public int getMovieYear() {
        return movieYear;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public int getMovieImage() {
        return movieImage;
    }
}
