package com.example.votebackend.repositories;

import com.example.votebackend.entities.EmailList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailListRepository extends JpaRepository<EmailList, Long> {
}
