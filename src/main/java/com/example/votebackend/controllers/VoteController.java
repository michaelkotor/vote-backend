package com.example.votebackend.controllers;

import com.example.votebackend.entities.Option;
import com.example.votebackend.entities.Poll;
import com.example.votebackend.entities.dto.*;
import com.example.votebackend.repositories.PollRepository;
import com.example.votebackend.services.PollService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/voter/poll")
public class VoteController {
    private final PollService pollService;

    @GetMapping("/preview")
    public HttpEntity<PollPreviewDto> preview(Long id) {
        PollPreviewDto pollPreviewDto = new PollPreviewDto(pollService.getPoll(id));
        return new HttpEntity<>(pollPreviewDto);
    }

    @GetMapping("/result")
    public HttpEntity<PollResultDto> result(Long id) {
        PollResultDto pollResultDto = new PollResultDto(pollService.getPoll(id));
        return new HttpEntity<>(pollResultDto);
    }

    @GetMapping("/question")
    public HttpEntity<QuestionDto> question(Long id) {
        QuestionDto questionDto = new QuestionDto(pollService.getPoll(id));
        return new HttpEntity<>(questionDto);
    }

    @PutMapping("/cast")
    public HttpEntity<PollCastDto> cast(@RequestParam Long poolId, OptionDto option) {
        // String token = tokenGenerator.generateToken(pollService.getPoll(id));
        // return new HttpEntity<>PollCastDto(token);
        return null;
    }

    @PostMapping("/")
    public Poll create(Poll poll) {
        return pollService.savePoll(poll);
    }
}
