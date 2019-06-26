package com.tasklist.demo;

import com.tasklist.demo.Todo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TodoRepository extends JpaRepository<Todo, Long>, TodoRepositoryCustom {
}
