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

import java.util.ArrayList;
import java.util.List;

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

    @GetMapping("/blog")
    public List<Post> getAllPosts() {
        List<Post> result = new ArrayList<>();
        result.add(new Post("Post1",
                "Content1",
                "Category1",
                new String[] { "Tags1" }
        ));

        result.add(new Post("Post2",
                "Content2",
                "Category2",
                new String[] { "Tags2" }
        ));

        result.add(new Post("Post3",
                "Content3",
                "Category3",
                new String[] { "Tags3" }
        ));

        return result;
    }

}
