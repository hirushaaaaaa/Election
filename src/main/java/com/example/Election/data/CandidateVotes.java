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
}
