package com.example.votebackend.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class EmailList {
    @Id
    private int id;
    private String title;
    @ElementCollection
   // @Type(type = "json")
    //@Column(columnDefinition = "json")
    private List<String> emails;
    //@CreationTimestamp ??
    private LocalDateTime created_at;
    //@UpdateTimestamp ??
    private LocalDateTime updated_at;
}
