package com.example.votebackend.entities;

import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity(name = "vote_user")
public class User {
    @Id
    @GeneratedValue
    private Long id;

    private boolean isActive;
    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @Transient
    //@OneToMany(cascade = CascadeType.ALL)
    private List<Poll> polls;
}
