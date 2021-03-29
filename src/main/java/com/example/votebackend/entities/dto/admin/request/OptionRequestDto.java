package com.example.votebackend.entities.dto.admin.request;

import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OptionRequestDto {
    private Map<String, Integer> options;
}
