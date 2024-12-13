package com.vlad.webfluxdemo.persistence.repository;

import com.vlad.webfluxdemo.persistence.entitiy.Project;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends ReactiveCrudRepository<Project, Long> {
}
