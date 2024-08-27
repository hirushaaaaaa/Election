package com.example.Election.controller;

import com.example.Election.data.Election;
import com.example.Election.service.ElectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ElectionController {

    @Autowired
    private ElectionService electionService;

    @GetMapping("/elections")
    public List<Election> getAllElections() {
        return electionService.getAllElections();
    }

    @GetMapping("/{id}")
    public Election getElectionById(@PathVariable Integer id) {
        return electionService.getElectionById(id);
    }

    @PostMapping("/elections/add")
    public Election createElection(@RequestBody Election election) {
        return electionService.createElection(election);
    }

    @PutMapping
    public Election updateElection(@RequestBody Election election) {
        return electionService.updateElection(election);
    }

    @DeleteMapping("/{id}")
    public void deleteElection(@PathVariable Integer id) {
        electionService.deleteElection(id);
    }
}
