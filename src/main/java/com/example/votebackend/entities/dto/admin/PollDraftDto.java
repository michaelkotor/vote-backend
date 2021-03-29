package com.example.votebackend.entities.dto.admin;

import com.example.votebackend.entities.poll.Status;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PollDraftDto {
    private String title;
    private String description;
    private String shortDescription;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    private QuestionDraftDto question;
    private Long emailListId;
    private Status status;


}
