package com.example.votebackend.entities.dto;

import com.example.votebackend.entities.Stats;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StatsDto {
    private int total;
    private int voted;
    private int unvoted;

    public StatsDto(Stats stats) {
        this.total = stats.getTotal();
        this.voted = stats.getVoted();
        this.unvoted = stats.getUnvoted();
    }
}
