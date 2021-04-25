package com.example.tema2.models;

import java.util.ArrayList;

public class User extends Model{
    private long id;
    private String name;
    private String username;
    private String emailAddress;
    private boolean postsVisible;
    private ArrayList<Post> posts;
    private ArrayList<Album> albums;

    public User(long id, String name, String username, String emailAddress){
        super(ModelType.USER);
        this.id=id;
        this.name=name;
        this.username=username;
        this.emailAddress=emailAddress;
        postsVisible=false;
        posts=new ArrayList<Post>();
        albums=new ArrayList<Album>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean arePostsVisible() {
        return postsVisible;
    }

    public void setPostsVisible(boolean postsVisible) {
        this.postsVisible = postsVisible;
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }
}
