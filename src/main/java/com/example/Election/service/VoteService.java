package com.example.Election.service;

import com.example.Election.data.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Election.data.Vote;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class VoteService {

    @Autowired
    private VoteRepository voteRepository;

    public List<Vote> getAllVotes() {
        return voteRepository.findAll();
    }

    public Vote getVoteById(Integer id) {
        return voteRepository.findById(id).orElse(null);
    }

    public Vote createVote(Vote vote) {
        return voteRepository.save(vote);
    }

    public Vote updateVote(Vote vote) {
        return voteRepository.save(vote);
    }

    public void deleteVote(Integer id) {
        voteRepository.deleteById(id);
    }

    // Method to count votes by candidate
    public Map<Integer, Long> countVotesByCandidate() {
        List<Vote> votes = voteRepository.findAll();
        return votes.stream()
                .collect(Collectors.groupingBy(Vote::getCandidateId, Collectors.counting()));
    }

    public boolean hasVoted(String voterId) {
        return voteRepository.existsByVoterId(voterId);
    }
}
