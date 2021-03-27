package com.example.votebackend.entities.dto;

import com.example.votebackend.entities.Poll;
import com.example.votebackend.entities.Question;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PollQuestionDto {
    private Long id;
    private QuestionDto question;

    public PollQuestionDto(Poll poll) {
        this.id = poll.getId();
        this.question = new QuestionDto(poll.getQuestion());
    }
}
