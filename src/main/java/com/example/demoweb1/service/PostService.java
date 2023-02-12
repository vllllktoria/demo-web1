package com.example.demoweb1.service;

import com.example.demoweb1.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    ArrayList<Post> posts = new ArrayList<>();
    Long id = 0l;
    public List<Post> listAllPosts(){
        return posts;
    }

    public void create(String text) {
        posts.add(new Post(id++, text, new Date()));
    }
}
