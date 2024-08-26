package com.example.Election.data;

import jakarta.persistence.*;
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
}
