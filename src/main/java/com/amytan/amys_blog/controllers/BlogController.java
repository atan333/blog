package com.amytan.amys_blog.controllers;

import com.amytan.amys_blog.controllers.model.PostTitle;
import com.amytan.amys_blog.model.Post;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogController {

    @PostMapping("/blog")
    public ResponseEntity<PostTitle> createPost(@RequestBody final Post post) {
        System.out.println(post);
        PostTitle result = new PostTitle(post.getTitle());
        return ResponseEntity.status(HttpStatus.CREATED)
                .contentType(MediaType.APPLICATION_JSON)
                .body(result);
    }

}
