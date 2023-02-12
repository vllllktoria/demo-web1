package com.example.demoweb1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Post implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String text;
    private int likes;
    private Date creationDate;

    public Post(Long id, String text, Date date){
        this.id = id;
        this.text = text;
        creationDate = date;
    }

    public Post() {
    }
}
