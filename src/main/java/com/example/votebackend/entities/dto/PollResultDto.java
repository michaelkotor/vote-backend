package com.example.votebackend.entities.dto;

import com.example.votebackend.entities.Poll;
import com.example.votebackend.entities.Status;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PollResultDto {
    private Long id;

    private String title;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    private QuestionDto question;

    private Status status;

    private StatsDto stats;

    private List<ResultDto> results;

    private String previewLink;

    public PollResultDto(Poll poll) {
        this.id = poll.getId();
        this.title = poll.getTitle();
        this.startDate = poll.getStartDate();
        this.endDate = poll.getEndDate();
        this.question = new QuestionDto(poll.getQuestion());
        this.status = poll.getStatus();
        this.stats = new StatsDto(poll.getStats());
        this.results = poll.getResults().stream().map(ResultDto::new)
                .collect(Collectors.toList());
        this.previewLink = poll.getPreviewLink();
    }

}
