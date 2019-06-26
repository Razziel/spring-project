package com.tasklist.demo;


import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class TodoRepositoryCustomImpl implements TodoRepositoryCustom{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void saveTask(Todo todo) {
        entityManager.merge(todo);
    }
}
