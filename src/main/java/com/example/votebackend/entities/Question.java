package com.example.votebackend.entities;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Question {
    @Id
    @GeneratedValue
    private Long id;

    private String title;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Option> options;
}
