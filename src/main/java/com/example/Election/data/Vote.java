package com.example.Election.data;

import jakarta.persistence.*;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "Vote")
public class Vote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer voteId;

    @Column(nullable = false)
    private Integer voterId;

    @Column(nullable = false)
    private Integer candidateId;

    @Column(nullable = false)
    private Integer electionId;

    @Column(nullable = false)
    private Date voteTimestamp;

    @Column(nullable = false)
    private Boolean voterStatus;

    // Default constructor
    public Vote() {}

    // Constructor with fields
    public Vote(Integer voteId, Integer voterId, Integer candidateId, Integer electionId, Date voteTimestamp, Boolean voterStatus) {
        this.voteId = voteId;
        this.voterId = voterId;
        this.candidateId = candidateId;
        this.electionId = electionId;
        this.voteTimestamp = voteTimestamp;
        this.voterStatus = voterStatus;
    }

    // Getters and Setters
    public Integer getVoteId() {
        return voteId;
    }

    public void setVoteId(Integer voteId) {
        this.voteId = voteId;
    }

    public Integer getVoterId() {
        return voterId;
    }

    public void setVoterId(Integer voterId) {
        this.voterId = voterId;
    }

    public Integer getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(Integer candidateId) {
        this.candidateId = candidateId;
    }

    public Integer getElectionId() {
        return electionId;
    }

    public void setElectionId(Integer electionId) {
        this.electionId = electionId;
    }

    public Date getVoteTimestamp() {
        return voteTimestamp;
    }

    public void setVoteTimestamp(Date voteTimestamp) {
        this.voteTimestamp = voteTimestamp;
    }

    public Boolean getVoterStatus() {
        return voterStatus;
    }

    public void setVoterStatus(Boolean voterStatus) {
        this.voterStatus = voterStatus;
    }
}
