package com.example.Election.controller;

import com.example.Election.service.ElectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/elections")
public class ElectionController {

    @Autowired
    private ElectionService electionService;

    @PostMapping("/start")
    public ResponseEntity<String> startElection() {
        String result = electionService.startElection();
        return ResponseEntity.ok(result);
    }

    @GetMapping("/results")
    public ResponseEntity<?> getElectionResults() {
        return ResponseEntity.ok(electionService.getElectionResults());
    }

    @GetMapping
    public ResponseEntity<?> getAllElections() {
        // Example method for getting all elections (if you have such a method)
        return ResponseEntity.ok("Retrieve all elections");
    }
}
