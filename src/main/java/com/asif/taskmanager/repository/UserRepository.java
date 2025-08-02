package com.asif.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asif.taskmanager.model.User;

public interface UserRepository extends JpaRepository<User, String> { }
