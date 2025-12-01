package com.szalai.springbootfour;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/{version}/posts", version = "1")
public class PostController {

    private final PostService postService;
    private final SmsSender smsSender;

    public PostController(PostService postService, SmsSender smsSender) {
        this.postService = postService;
        this.smsSender = smsSender;
    }

    @GetMapping
    public List<Post> getAllPosts() {
        smsSender.send("hello world");
        return postService.getPosts();
    }
}
