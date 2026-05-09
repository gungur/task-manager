package com.sai.notionlite.controller;

import com.sai.notionlite.model.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {

    @GetMapping("/tasks")
    public List<Task> getTasks() {

        return List.of(
                new Task(1L, "Learn Spring Boot", false),
                new Task(2L, "Build REST API", true),
                new Task(3L, "Push project to GitHub", false)
        );
    }
}