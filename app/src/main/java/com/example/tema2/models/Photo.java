package com.example.tema2.models;

public class Photo {
    private long albumId;
    private long id;
    private String title;
    private String url;
    private String thumbnailUrl;

    public Photo(long albumId, long id, String title, String url, String thumbnailUrl){
        this.albumId=albumId;
        this.id=id;
        this.title = title;
        this.thumbnailUrl = thumbnailUrl;
        this.url=url;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }
}
