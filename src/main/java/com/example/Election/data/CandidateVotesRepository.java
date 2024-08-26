package com.example.Election.data;

import com.example.Election.data.CandidateVotes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateVotesRepository extends JpaRepository<CandidateVotes, Integer> {
}

