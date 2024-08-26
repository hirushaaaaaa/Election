package com.example.Election.service;

import com.example.Election.data.Vote;
import com.example.Election.data.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class VoteService {

    @Autowired
    private VoteRepository voteRepository;

    // Update this method signature to include electionId
    public boolean castVote(Integer voterId, Integer candidateId, Integer electionId, boolean voteStatus) {
        if (voteRepository.existsByVoterIdAndCandidateIdAndElectionId(voterId, candidateId, electionId)) {
            return false; // Already voted
        }
        Vote vote = new Vote(null, voterId, candidateId, electionId, new Date(), voteStatus);
        voteRepository.save(vote);
        return true;
    }
}
