package com.example.votebackend.entities.dto.admin.request;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuestionRequestDto {
    private String title;
    private List<OptionRequestDto> option;
}
