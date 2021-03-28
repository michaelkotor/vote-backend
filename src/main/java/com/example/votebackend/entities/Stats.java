package com.example.votebackend.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Stats {
    @Id
    private Long id;
    private int total;
    private int voted;
    private int unvoted;
}
