package com.example.votebackend.entities.dto.admin.request;

import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmailListRequest {
    private String title;
    private Set<String> emails;
}
