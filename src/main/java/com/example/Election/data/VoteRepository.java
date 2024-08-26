package com.example.Election.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Integer> {
    boolean existsByVoterIdAndCandidateIdAndElectionId(Integer voterId, Integer candidateId, Integer electionId);
}
