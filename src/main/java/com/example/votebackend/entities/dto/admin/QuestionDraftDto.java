package com.example.votebackend.entities.dto.admin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuestionDraftDto {
    private String title;
    private OptionDraftDto option;
}
