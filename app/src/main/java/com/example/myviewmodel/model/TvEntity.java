package com.example.myviewmodel.model;

public class TvEntity {
    private String id;
    private String title;
    private String desc;
    private int TvImage;

    public TvEntity(String id, String title, String desc, int tvImage) {
        this.id = id;
        this.title = title;
        this.desc = desc;
        TvImage = tvImage;
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
        return TvImage;
    }
}
