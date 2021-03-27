package com.example.votebackend.entities.dto;

import com.example.votebackend.entities.Poll;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OptionDto {
    private String option;
    private Integer option_index;
}
