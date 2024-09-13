package com.example.election.data;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<Vote, Integer> {
    boolean existsByVoterId(String voterId);
}