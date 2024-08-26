package com.example.Election.controller;

import com.example.Election.service.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/votes")
public class VoteController {

    @Autowired
    private VoteService voteService;

    @PostMapping("/cast")
    public ResponseEntity<String> castVote(@RequestParam Integer voterId, @RequestParam Integer candidateId, @RequestParam Integer electionId, @RequestParam boolean voteStatus) {
        boolean result = voteService.castVote(voterId, candidateId, electionId, voteStatus);
        if (result) {
            return ResponseEntity.ok("Vote cast successfully");
        } else {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body("You have already voted for this candidate in this election");
        }
    }
}
