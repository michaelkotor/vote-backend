package com.example.votebackend.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
public class Result implements Serializable {
    @Id
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL)
    private Poll poll;
    private String token;
    @Column(name = "choice")
    private String option;
    @Column(name = "choice_index")
    private Integer option_index;
}
