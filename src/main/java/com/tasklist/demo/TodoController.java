package com.tasklist.demo;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/tasks")
@AllArgsConstructor
public class TodoController {
    private final TodoRepository repository;


}