package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.*;

import java.util.List;

@Service
public class PostService {


    public List<Post> listAllPosts(){

        return List.of(new Post("Choto-to",789),
                new Post("Neti",12042),
                new Post("voeto",12312));
    }
}
