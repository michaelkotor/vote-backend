package com.example.votebackend.entities.poll;

import java.util.Map;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Option {
    @Id
    @GeneratedValue
    private Long id;

    @ElementCollection
    private Map<String, Integer> choices;


}
