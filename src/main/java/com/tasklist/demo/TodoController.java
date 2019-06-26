package com.tasklist.demo;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/tasks")
@AllArgsConstructor
public class TodoController {
    private final TodoRepository repository;

    @GetMapping("")
    public List<Todo> getAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Todo get(@PathVariable long id) {
        return repository.getOne(id);
    }


    @PostMapping("")
    public void add(@RequestBody Todo task) {
        repository.saveTask(task);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        repository.deleteById(id);
    }


}