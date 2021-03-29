package com.example.votebackend.entities;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Transient;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Invitation {
    @Id
    @GeneratedValue
    private Long id;

    @Transient
    private Poll poll;

    private String email;
    private LocalDateTime votedAt;

    private String token;
}
