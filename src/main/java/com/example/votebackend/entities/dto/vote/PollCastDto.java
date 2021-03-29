package com.example.votebackend.entities.dto.vote;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PollCastDto {
    private String token;
}
