package com.example.Election.data;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<Vote, Integer> {
    boolean existsByVoterId(String voterId);
}