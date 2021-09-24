package com.example.myviewmodel.model;

public class MovieEntity {
    private String id;
    private String title;
    private String desc;
    private int movieYear;
    private int movieImage;

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
