package com.example.Election.service;

import com.example.Election.data.CandidateVotes;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ElectionService {

    public String startElection() {
        return "Election started successfully";
    }

    public List<CandidateVotes> getElectionResults() {
        List<CandidateVotes> results = new ArrayList<>();
        return results;
    }
}
