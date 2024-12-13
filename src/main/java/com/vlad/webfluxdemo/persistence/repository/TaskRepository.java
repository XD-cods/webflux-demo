package com.vlad.webfluxdemo.persistence.repository;

import com.vlad.webfluxdemo.persistence.entitiy.Task;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends ReactiveCrudRepository<Task, Long> {
}
