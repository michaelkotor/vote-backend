package com.example.votebackend.repositories;

import com.example.votebackend.entities.Poll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface PollRepository extends JpaRepository<Poll, Long> {

}
