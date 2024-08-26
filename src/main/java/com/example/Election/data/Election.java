package com.example.Election.data;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "election")
public class Election {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "electionId")
    private Integer electionId;

    public Integer getElectionId() {
        return electionId;
    }

    public void setElectionId(Integer electionId) {
        this.electionId = electionId;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public String getElectionName() {
        return electionName;
    }

    public void setElectionName(String electionName) {
        this.electionName = electionName;
    }

    @Column(name = "electionName")
    private String electionName;

    @Column(name = "startDate")
    private LocalDateTime startDate;

    @Column(name = "endDate")
    private LocalDateTime endDate;

}
