package com.example.votebackend.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue
    private Long id;
    @Email // necessary??
    private String email;
    private boolean active;
    //@CreationTimestamp ??
    private LocalDateTime created_at;
    //@UpdateTimestamp ??
    private LocalDateTime updated_at;

}
