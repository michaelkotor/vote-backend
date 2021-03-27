package com.example.votebackend.entities.dto;

import com.example.votebackend.entities.Option;
import com.example.votebackend.entities.Poll;
import com.example.votebackend.entities.Question;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class QuestionDto {
    private Long id;
    private Question question;

    public QuestionDto(Poll poll) {
        this.id = poll.getId();
        this.question = poll.getQuestion();
    }
}
