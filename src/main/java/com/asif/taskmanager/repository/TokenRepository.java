package com.asif.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asif.taskmanager.model.Token;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TokenRepository extends JpaRepository<Token, String> {
    Token findByUsername(String username);
    List<Token> findAllByUsername(String username);
    Token findByToken(UUID token);
}
