package com.example.votebackend.services;

import com.example.votebackend.entities.Poll;
import com.example.votebackend.repositories.PollRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@AllArgsConstructor
@Service
public class PollService {
    private final PollRepository pollRepository;

    public Poll getPoll(Long id){
        return pollRepository.findById(id).orElseThrow();
    }
    public Poll setPoll(Poll poll){
        return pollRepository.save(poll);
    }
    public Poll savePoll(Poll poll){
        return pollRepository.save(poll);
    }


}
