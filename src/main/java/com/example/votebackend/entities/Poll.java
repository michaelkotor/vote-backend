package com.example.votebackend.entities;

import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Poll {
    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String description;
    private String shortDescription;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    //TODO
    @OneToOne(cascade = CascadeType.ALL)
    private Question question;

    private Status status;

    @OneToOne(cascade = CascadeType.ALL)
    private Stats stats;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Result> results;

    private String previewLink;
}
