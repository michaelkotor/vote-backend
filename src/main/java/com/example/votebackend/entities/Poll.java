package com.example.votebackend.entities;

import com.example.votebackend.entities.poll.Question;
import com.example.votebackend.entities.poll.Result;
import com.example.votebackend.entities.poll.Stats;
import com.example.votebackend.entities.poll.Status;
import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;
import lombok.Data;

@Data
@Entity
public class Poll {
    @Id
    @GeneratedValue
    private Long id;

    //TODO: find relationship
    @Transient
    //OneToOne
    //@MapsId
    private User user;

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

    @OneToOne(fetch = FetchType.EAGER)
    private EmailList emailList;

    private String previewLink;
}
