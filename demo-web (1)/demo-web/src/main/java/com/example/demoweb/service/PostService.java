package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.*;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class PostService {


    public List<Post> listAllPosts(){

        return List.of(new Post("Choto-to", new Date(1917, Calendar.FEBRUARY, 15), 10000),
                new Post("Neti",new Date(1917, Calendar.APRIL, 20), 150000),
                new Post("voeto",new Date(1917, Calendar.AUGUST, 1), 20000));
    }
}
