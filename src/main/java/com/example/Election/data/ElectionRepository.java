package com.example.Election.data;


import com.example.Election.data.Election;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ElectionRepository extends JpaRepository<Election, Integer> {
}


