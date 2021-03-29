package com.example.votebackend.entities.dto.admin.request;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PollDraftRequest {
    private String title;
    private String description;
    private String shortDescription;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    private QuestionRequestDto question;
    private Long emailListId;

}
