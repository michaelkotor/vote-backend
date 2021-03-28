package com.example.votebackend.entities;

import com.bazarnazar.pgjson.PGJsonObject;
import com.fasterxml.jackson.core.type.TypeReference;
import lombok.Data;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@TypeDefs({@TypeDef( name= "JsonObject", typeClass = Option.class)})
public class Question extends PGJsonObject {
    @Id
    @GeneratedValue
    private Long id;

    private String title;

    @Type(type = "JsonObject")
    @OneToMany(cascade = CascadeType.ALL)
    private List<Option> options;

}
