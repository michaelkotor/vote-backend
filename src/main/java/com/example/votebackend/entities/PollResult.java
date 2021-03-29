package com.example.votebackend.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class PollResult {
    @Id
    @GeneratedValue
    private Long id;

    private String token;

    @OneToOne(cascade = CascadeType.ALL)
    private Poll poll;

    private String choice;
    private int choiceIndex;

}
