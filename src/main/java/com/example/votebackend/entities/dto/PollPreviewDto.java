package com.example.votebackend.entities.dto;

import com.example.votebackend.entities.Poll;
import com.example.votebackend.entities.Question;
import com.example.votebackend.entities.Result;
import com.example.votebackend.entities.Stats;
import com.example.votebackend.entities.Status;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
        this.startDate = poll.getStartDate();
        this.endDate = poll.getEndDate();
        this.question = new QuestionDto(poll.getQuestion());
        this.status = poll.getStatus();
        this.stats = new StatsDto(poll.getStats());
        this.previewLink = poll.getPreviewLink();
    }
}
