package com.example.Election.controller;

import com.example.Election.data.Vote;
import com.example.Election.service.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/votes")
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
    public Vote createVote(@RequestBody Vote vote) {
        return voteService.createVote(vote);
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
}
