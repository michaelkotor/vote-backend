package com.example.votebackend.entities;

import java.util.Map;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Option {
    @Id
    @GeneratedValue
    private Long id;
    private String option;
    private Long optionIndex;

}
