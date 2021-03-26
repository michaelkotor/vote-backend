package com.example.votebackend.entities.dto;

import com.example.votebackend.entities.Option;
import com.example.votebackend.entities.Question;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class QuestionDto {
    private String title;
    private List<Option> options;

    public QuestionDto(Question question) {
        this.title = question.getTitle();
        this.options = question.getOptions();
    }
}
