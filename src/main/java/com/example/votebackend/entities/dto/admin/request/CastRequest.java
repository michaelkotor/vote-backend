package com.example.votebackend.entities.dto.admin.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CastRequest {
    private String option;
    private int optionIndex;
}
