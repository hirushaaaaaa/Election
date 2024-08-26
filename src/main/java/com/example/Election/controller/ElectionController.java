package com.example.Election.controller;

import com.example.Election.data.Election;
import com.example.Election.data.ElectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/elections")
public class ElectionController {

    @Autowired
    private ElectionRepository electionRepository;

    @GetMapping
    public List<Election> getAllElections() {
        return electionRepository.findAll();
    }

    @GetMapping("/{id}")
    public Election getElectionById(@PathVariable Integer id) {
        return electionRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Election createElection(@RequestBody Election election) {
        return electionRepository.save(election);
    }

    @PutMapping("/{id}")
    public Election updateElection(@PathVariable Integer id, @RequestBody Election election) {
        election.setElectionId(id);
        return electionRepository.save(election);
    }

    @DeleteMapping("/{id}")
    public void deleteElection(@PathVariable Integer id) {
        electionRepository.deleteById(id);
    }
}
