package com.example.tema2.models;

import java.util.ArrayList;

public class Album extends Model{
    private long userId;
    private long id;
    private String title;
    private ArrayList<Photo> photos;

    public Album(long userId, long id, String title) {
        super(ModelType.ALBUM);
        this.userId = userId;
        this.id=id;
        this.title=title;
        photos = new ArrayList<Photo>();
    }

    public ArrayList<Photo> getPhotos() {
        return photos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
}
