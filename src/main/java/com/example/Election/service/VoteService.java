package com.example.Election.service;

import com.example.Election.data.Vote;
import com.example.Election.data.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoteService {

    @Autowired
    private VoteRepository voteRepository;

    public List<Vote> getAllVotes() {
        return voteRepository.findAll();
    }

    public Vote getVoteById(Integer voteId) {
        return voteRepository.findById(voteId).orElse(null);
    }

    public Vote createVote(Vote vote) {
        return voteRepository.save(vote);
    }

    public Vote updateVote(Vote vote) {
        return voteRepository.save(vote);
    }

    public void deleteVote(Integer voteId) {
        voteRepository.deleteById(voteId);
    }
}
