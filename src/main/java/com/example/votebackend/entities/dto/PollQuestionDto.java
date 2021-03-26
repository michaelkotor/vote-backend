package com.example.votebackend.entities.dto;

import com.example.votebackend.entities.Question;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PollQuestionDto {
    private Long id;
    private QuestionDto question;

    public PollQuestionDto(Long id, Question question) {
        this.id = id;
        this.question = new QuestionDto(question);
    }
}
