package com.example.votebackend.controllers.vote;

import com.example.votebackend.entities.Poll;
import com.example.votebackend.entities.dto.vote.PollCastDto;
import com.example.votebackend.entities.dto.admin.request.CastRequest;
import com.example.votebackend.entities.poll.Question;
import com.example.votebackend.repositories.PollRepository;
import com.example.votebackend.repositories.QuestionRepository;
import com.example.votebackend.service.PollService;
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
@AllArgsConstructor
@RequestMapping("/voter/poll")
public class VoteController {
    private final PollRepository pollRepository;
    private final QuestionRepository questionRepository;
    private final PollService pollService;

    @GetMapping("/preview")
    public ResponseEntity<Poll> preview(Long id) {
        return new ResponseEntity<>(pollRepository.findById(id).orElseThrow(), HttpStatus.OK);
    }

    @GetMapping("/result")
    public ResponseEntity<Poll> result(Long id) {
        return new ResponseEntity<>(pollRepository.findById(id).orElseThrow(), HttpStatus.OK);
    }

    @GetMapping("/question")
    public ResponseEntity<Question> question(Long id) {
        return new ResponseEntity<>(questionRepository.findById(id).orElseThrow(), HttpStatus.OK);
    }

    @PutMapping("/cast")
    public ResponseEntity<PollCastDto> cast(@RequestParam Long id, @RequestBody CastRequest castRequest) {
        return new ResponseEntity<>(pollService.vote(id, castRequest), HttpStatus.OK);
    }

    //TODO:remove
    @PostMapping("/")
    public Poll create(@RequestBody Poll poll) {
        return pollRepository.save(poll);
    }
}
