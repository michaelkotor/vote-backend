package com.example.votebackend.entities.dto;

import com.example.votebackend.entities.Poll;
import com.example.votebackend.entities.Status;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PollPreviewDto {

    private Long id;

    private String title;
    private String description;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    private QuestionDto question;

    private Status status;

    private StatsDto stats;

    private String previewLink;

    public PollPreviewDto(Poll poll) {
        this.id = poll.getId();
        this.title = poll.getTitle();
        this.description = poll.getDescription();
        this.startDate = poll.getStartDate();
        this.endDate = poll.getEndDate();
        this.question = new QuestionDto(poll.getQuestion());
        this.status = poll.getStatus();
        this.stats = new StatsDto(poll.getStats());
        this.previewLink = poll.getPreviewLink();
    }
}
