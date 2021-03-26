package com.example.votebackend.entities.dto;

import com.example.votebackend.entities.Result;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResultDto {
    private Map<String, String> results;

    public ResultDto(Result result) {
        this.results = result.getResults();
    }
}
