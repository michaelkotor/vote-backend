package com.example.votebackend.entities;

import com.bazarnazar.pgjson.PGJsonObject;
import com.fasterxml.jackson.core.type.TypeReference;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import com.vladmihalcea.hibernate.type.json.JsonStringType;
import lombok.Data;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.*;
import java.util.List;

@Data
@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
public class Question extends PGJsonObject {
    private String title;
    @Type(type = "jsonb")
    @Column(columnDefinition = "jsonb")
    @OneToMany(cascade = CascadeType.ALL)
    private List<Option> options;
}
