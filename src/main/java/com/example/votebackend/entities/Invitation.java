package com.example.votebackend.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
public class Invitation implements Serializable {
    @Id
    private Long pollId;
   // @ManyToOne
   // @JoinColumn(name="pool_id", nullable=false)
    //private Poll pollId;
    //@Email
    private String email;
    private LocalDateTime votedAt;

}
