package com.example.votebackend.entities;

import java.time.LocalDateTime;
import java.util.Set;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class EmailList {
    @Id
    @GeneratedValue
    private Long id;

    private String title;

    @ElementCollection(targetClass = String.class)
    private Set<String> emails;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
