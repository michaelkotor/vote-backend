package com.example.votebackend.entities.poll;

import java.util.Map;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Result {
    @Id
    @GeneratedValue
    private Long id;

    @ElementCollection
    private Map<String, Integer> results;
}
