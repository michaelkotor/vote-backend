package com.example.votebackend.controllers;

import com.example.votebackend.entities.Poll;
import com.example.votebackend.entities.dto.PollCastDto;
import com.example.votebackend.entities.dto.PollPreviewDto;
import com.example.votebackend.entities.dto.PollQuestionDto;
import com.example.votebackend.entities.dto.PollResultDto;
import com.example.votebackend.repositories.PollRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/voter/poll")
public class VoteController {
    private final PollRepository pollRepository;

    @GetMapping("/preview")
    public ResponseEntity<PollPreviewDto> preview(Long id) {
        return new ResponseEntity<>(new PollPreviewDto(pollRepository.findById(id).orElseThrow()), HttpStatus.OK);
    }

    @GetMapping("/result")
    public ResponseEntity<PollResultDto> result(Long id) {
        return new ResponseEntity<>(new PollResultDto(pollRepository.findById(id).orElseThrow()), HttpStatus.OK);
    }

    @GetMapping("/question")
    public ResponseEntity<PollQuestionDto> question(Long id) {
        return new ResponseEntity<>(new PollQuestionDto(pollRepository.findById(id).orElseThrow()), HttpStatus.OK);
    }

    @PutMapping("/cast")
    public ResponseEntity<PollCastDto> cast(Long id) {
        return null;
    }

    @PostMapping("/")
    public Poll create(@RequestBody Poll poll) {
        pollRepository.save(poll);
        return poll;
    }
}
