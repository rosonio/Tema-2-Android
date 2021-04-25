package com.example.tema2.models;

public class Post extends Model {
    private long userId;
    private long id;
    private String title;
    private String body;

    public Post(long userId, long id, String title, String body) {
        super(ModelType.POST);
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
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
