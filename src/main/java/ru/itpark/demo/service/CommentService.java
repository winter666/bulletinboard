package ru.itpark.demo.service;

import ru.itpark.demo.domain.Comment;
import ru.itpark.demo.repository.CommentRepository;

import java.util.List;

public class CommentService {
    private final CommentRepository repository;

    public CommentService(CommentRepository repository) {
        this.repository = repository;
    }

   public void add(String author, String text) {
        repository.add(new Comment(author, text));
   }

    public List<Comment> getAll(){
        return repository.getAll();
    }
}
