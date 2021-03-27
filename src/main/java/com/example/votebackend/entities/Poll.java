package com.example.votebackend.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
public class Poll {
    @Id
    @GeneratedValue
    private Long id;
    @OneToOne(cascade = CascadeType.ALL)
    private User user;
    @OneToOne(cascade = CascadeType.ALL)
    private EmailList emailListId;
    private String title;
    @Column(columnDefinition="TEXT")
    private String description;
    @Column(columnDefinition="TEXT")
    private String shortDescription;
    @Column(name="started_at")
    private LocalDateTime startDate;
    @Column(name="ended_at")
    private LocalDateTime endDate;

    //TODO
    //@Type(type = "JsonObject") не работает блеать
    @OneToOne(cascade = CascadeType.ALL)
    private Question question;

    @Transient
    private Status status;

    @Transient
    @OneToOne(cascade = CascadeType.ALL)
    private Stats stats;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Result> results;

    @Transient
    private String previewLink;
}
