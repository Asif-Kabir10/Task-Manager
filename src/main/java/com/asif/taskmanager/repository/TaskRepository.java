package com.asif.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asif.taskmanager.model.Task;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Integer> {
    List<Task> findAllByUsername(String username);
}
