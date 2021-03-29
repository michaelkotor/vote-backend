package com.example.votebackend.entities.dto.admin;

import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OptionDraftDto {
    private Map<String, Integer> options;
}
