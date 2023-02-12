package com.example.demoweb1.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Post {
    private Long id;
    private String text;
    private int likes;
    private Date creationDate;

    public Post(Long id, String text, Date date){
        this.id = id;
        this.text = text;
        creationDate = date;
    }
}
