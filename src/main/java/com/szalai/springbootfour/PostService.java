package com.szalai.springbootfour;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

@HttpExchange(url = "https://jsonplaceholder.typicode.com/posts")
public interface PostService {

    @GetExchange
    List<Post> getPosts();
}
