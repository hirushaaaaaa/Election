package com.example.Election.data;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateVotesRepository extends JpaRepository<CandidateVotes, Integer> {
}
