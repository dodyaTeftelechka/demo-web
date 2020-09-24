package com.example.demoweb.model;

import java.util.Date;

public class Post {
    private String text;
    private Integer likes;
    private Date creationDate;

    public Post(String text, Date creationDate, Integer likes){
        this.text = text;
        this.creationDate = creationDate;
        this.likes = likes;
    }

    public String getText(){
        return this.text;
    }
    public Integer getLikes(){
        return this.likes;
    }
    public Date getCreationDate() {
        return creationDate;
    }
}
