package com.example.Election.controller;

import com.example.Election.data.Vote;
import com.example.Election.service.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/votes")
@CrossOrigin(origins = "*")
public class VoteController {

    @Autowired
    private VoteService voteService;

    @GetMapping
    public List<Vote> getAllVotes() {
        return voteService.getAllVotes();
    }

    @GetMapping("/{id}")
    public Vote getVoteById(@PathVariable Integer id) {
        return voteService.getVoteById(id);
    }

    @PostMapping
    public ResponseEntity<String> createVote(@RequestBody Vote vote) {
        if (voteService.hasVoted(vote.getVoterId())) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Voter has already cast a vote.");
        }
        voteService.createVote(vote);
        return ResponseEntity.ok("Vote cast successfully!");
    }

    @PutMapping
    public Vote updateVote(@RequestBody Vote vote) {
        return voteService.updateVote(vote);
    }

    @DeleteMapping("/{id}")
    public void deleteVote(@PathVariable Integer id) {
        voteService.deleteVote(id);
    }

    @GetMapping("/test")
    public String test() {
        return "Controller is working!";
    }
    @GetMapping("/countByCandidate")
    public Map<Integer, Long> getVoteCountsByCandidate() {
        List<Vote> votes = voteService.getAllVotes();
        // Group votes by candidateId and count the occurrences
        return votes.stream().collect(Collectors.groupingBy(Vote::getCandidateId, Collectors.counting()));
    }



}
