package com.example.myviewmodel.model;

public class TvEntity {
    private final String id;
    private final String title;
    private final String desc;
    private final int tvYear;
    private final int tvImage;

    public int getTvYear() {
        return tvYear;
    }

    public TvEntity(String id, String title, String desc, int tvYear, int tvImage) {
        this.id = id;
        this.title = title;
        this.desc = desc;
        this.tvYear = tvYear;
        this.tvImage = tvImage;
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

    public int getTvImage() {
        return tvImage;
    }
}
