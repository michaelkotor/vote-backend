package com.example.votebackend.controllers;

import com.example.votebackend.entities.Poll;
import com.example.votebackend.entities.dto.PollCastDto;
import com.example.votebackend.entities.dto.PollPreviewDto;
import com.example.votebackend.entities.dto.PollQuestionDto;
import com.example.votebackend.entities.dto.PollResultDto;
import com.example.votebackend.repositories.PollRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/voter/poll")
public class VoteController {
    private final PollRepository pollRepository;

    @GetMapping("/preview")
    public HttpEntity<PollPreviewDto> preview(Long id) {
        return new HttpEntity(pollRepository.findById(id).orElseThrow());
    }

    @GetMapping("/result")
    public HttpEntity<PollResultDto> result(Long id) {
        return null;
    }

    @GetMapping("/question")
    public HttpEntity<PollQuestionDto> question(Long id) {
        return null;
    }

    @PutMapping("/cast")
    public HttpEntity<PollCastDto> cast(Long id) {
        return null;
    }

    @PostMapping("/")
    public Poll create(Poll poll) {
        pollRepository.save(poll);
        return poll;
    }
}
