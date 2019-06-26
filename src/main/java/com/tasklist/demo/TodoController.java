package com.tasklist.demo;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/tasks")
@AllArgsConstructor
public class TodoController {
    private final TodoRepository repository;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("")
    public List<Todo> getAll() {
        return repository.findAll();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/{id}")
    public Todo get(@PathVariable long id) {
        return repository.getOne(id);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("")
    public void add(@RequestBody Todo todo) {
        repository.saveTask(todo);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        repository.deleteById(id);
    }


}