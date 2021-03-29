package com.example.votebackend.repositories;

import com.example.votebackend.entities.poll.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
