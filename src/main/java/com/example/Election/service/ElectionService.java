package com.example.Election.service;

import com.example.Election.data.Election;
import com.example.Election.data.ElectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ElectionService {

    @Autowired
    private ElectionRepository electionRepository;

    public List<Election> getAllElections() {
        return electionRepository.findAll();
    }

    public Election getElectionById(Integer electionId) {
        return electionRepository.findById(electionId).orElse(null);
    }

    public Election createElection(Election election) {
        return electionRepository.save(election);
    }

    public Election updateElection(Election election) {
        return electionRepository.save(election);
    }

    public void deleteElection(Integer electionId) {
        electionRepository.deleteById(electionId);
    }
}
