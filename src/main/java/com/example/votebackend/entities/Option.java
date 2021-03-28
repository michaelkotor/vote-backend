package com.example.votebackend.entities;

import java.util.Map;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.bazarnazar.pgjson.PGJsonObject;
import lombok.Data;

@Data
@Entity
public class Option extends PGJsonObject {
    @Id
    @GeneratedValue
    private Long id;
    private String option;
    private Long optionIndex;

}
