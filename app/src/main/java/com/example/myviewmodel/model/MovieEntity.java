package com.example.myviewmodel.model;

public class MovieEntity {
    private String id;
    private String title;
    private String desc;
    private int movieImage;

    public MovieEntity(String id, String title, String desc, int movieImage) {
        this.id = id;
        this.title = title;
        this.desc = desc;
        this.movieImage = movieImage;
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
