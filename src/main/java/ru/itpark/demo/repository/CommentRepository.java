package ru.itpark.demo.repository;

import ru.itpark.demo.domain.Comment;

import java.util.ArrayList;
import java.util.List;

public class CommentRepository {
    private final List<Comment> comments= new ArrayList<>();

    public void add(Comment comment){
        this.comments.add(comment);
    }
    public List<Comment> getAll(){
        return comments;
    }

}
