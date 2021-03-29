package com.example.votebackend.controllers.admin;

import com.example.votebackend.entities.Poll;
import com.example.votebackend.entities.dto.admin.PollDraftDto;
import com.example.votebackend.entities.dto.admin.request.PollDraftRequest;
import com.example.votebackend.service.PollService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
@AllArgsConstructor
public class PollController {
    private final PollService pollService;

    @PostMapping("/poll/draft")
    public ResponseEntity<Poll> createDraftPoll(@RequestBody PollDraftRequest pollDraftRequest) {
        return new ResponseEntity<>(pollService.createDraft(pollDraftRequest), HttpStatus.CREATED);
    }

    @PutMapping("/poll/draft")
    public ResponseEntity<Poll> updateDraftPoll(@RequestParam Long id, @RequestBody PollDraftRequest pollDraftRequest) {
        return new ResponseEntity<>(pollService.updateDraft(id, pollDraftRequest), HttpStatus.OK);
    }

    @PutMapping("/poll/publish")
    public ResponseEntity<Poll> publishPoll(@RequestParam Long id) {
        return new ResponseEntity<>(pollService.publish(id), HttpStatus.OK);
    }

    @GetMapping("/polls")
    public ResponseEntity<List<Poll>> getAllPolls() {
        return new ResponseEntity<>(pollService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<Poll> getPoll(@RequestParam Long id) {
        return new ResponseEntity<>(pollService.get(id), HttpStatus.OK);
    }
}
