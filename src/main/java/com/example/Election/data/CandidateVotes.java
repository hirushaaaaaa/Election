package com.example.Election.data;

import jakarta.persistence.*;

@Entity
@Table(name = "CandidateVotes")
public class CandidateVotes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Integer candidateId;

    @Column(nullable = false)
    private Integer electionId;

    @Column(nullable = false)
    private Integer voteCount;

    @ManyToOne
    @JoinColumn(name = "electionId", insertable = false, updatable = false)
    private Election election;

    // Getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
    }

    public Election getElection() {
        return election;
    }

    public void setElection(Election election) {
        this.election = election;
    }
}
