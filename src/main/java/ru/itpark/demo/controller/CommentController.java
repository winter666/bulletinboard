package ru.itpark.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.itpark.demo.domain.Comment;
import ru.itpark.demo.service.CommentService;

public class CommentController {
    private final CommentService service;

    public CommentController(CommentService service) {
        this.service = service;
    }
    @GetMapping
    public String getAll(Model model){
        model.addAttribute("comments",service.getAll());
        return "view";
    }
    @PostMapping
    public String send(Model model,
                       @RequestParam String author,
                       @RequestParam String text){
        service.add(author, text);
        model.addAttribute("comments",service.getAll());
        return "view";
    }
}
