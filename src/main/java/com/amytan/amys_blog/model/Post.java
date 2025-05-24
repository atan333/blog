package com.amytan.amys_blog.model;

import java.util.Arrays;

public class Post {

    private final String title;
    private final String content;
    private final String category;
    private final String[] tags;

    public Post(final String title,
                final String content,
                final String category,
                final String[] tags) {
        this.title = title;
        this.content = content;
        this.category = category;
        this.tags = tags;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getCategory() {
        return category;
    }

    public String[] getTags() {
        return tags;
    }

    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", category='" + category + '\'' +
                ", tags=" + Arrays.toString(tags) +
                '}';
    }
}
