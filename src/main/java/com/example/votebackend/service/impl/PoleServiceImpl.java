package com.example.votebackend.service.impl;

import com.example.votebackend.entities.EmailList;
import com.example.votebackend.entities.Poll;
import com.example.votebackend.entities.dto.admin.request.CastRequest;
import com.example.votebackend.entities.dto.admin.request.PollDraftRequest;
import com.example.votebackend.entities.poll.Option;
import com.example.votebackend.entities.poll.Question;
import com.example.votebackend.entities.poll.Result;
import com.example.votebackend.entities.dto.vote.PollCastDto;
import com.example.votebackend.entities.poll.Status;
import com.example.votebackend.repositories.EmailListRepository;
import com.example.votebackend.repositories.InvitationRepository;
import com.example.votebackend.repositories.PollRepository;
import com.example.votebackend.service.PollService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PoleServiceImpl implements PollService {
    private final PollRepository pollRepository;
    private final EmailListRepository emailListRepository;
    private final InvitationRepository invitationRepository;

    @Override
    public PollCastDto vote(Long voteId, CastRequest castRequest) {
        Poll poll = pollRepository.findById(voteId).orElseThrow();

        Result result = new Result();
        Map<String, Integer> map = new HashMap<>();
        map.put(castRequest.getOption(), castRequest.getOptionIndex());
        result.setResults(map);
        pollRepository.save(poll);
        return null;
    }

    @Override
    public Poll createDraft(PollDraftRequest pollDraftRequest) {
        Poll poll = new Poll();
        return processPoll(pollDraftRequest, poll);
    }

    @Override
    public Poll updateDraft(Long id, PollDraftRequest pollDraftRequest) {
        Poll poll = pollRepository.findById(id).orElseThrow();
        return processPoll(pollDraftRequest, poll);
    }

    @Override
    public Poll publish(Long id) {
        Poll toPublish = pollRepository.findById(id).orElseThrow();
        toPublish.setStatus(Status.PUBLISHED);
        return pollRepository.save(toPublish);
    }

    @Override
    public List<Poll> getAll() {
        return pollRepository.findAll();
    }

    @Override
    public Poll get(Long id) {
        return pollRepository.findById(id).orElseThrow();
    }

    //TODO: to test for all properties!
    private Poll processPoll(PollDraftRequest pollDraftRequest, Poll poll) {
        poll.setTitle(pollDraftRequest.getTitle());
        poll.setDescription(pollDraftRequest.getDescription());
        poll.setShortDescription(pollDraftRequest.getShortDescription());
        poll.setStartDate(pollDraftRequest.getStartDate());
        poll.setEndDate(pollDraftRequest.getEndDate());

        Question question = new Question();
        question.setTitle(pollDraftRequest.getQuestion().getTitle());
        question.setOptions(
                pollDraftRequest
                        .getQuestion()
                        .getOption()
                        .stream()
                        .map((option) -> {
                            Option toReturn = new Option();
                            toReturn.setChoices(option.getOptions());
                            return toReturn;
                        })
                        .collect(Collectors.toList()));

        poll.setQuestion(question);

        EmailList emailList = emailListRepository.findById(pollDraftRequest.getEmailListId()).orElseThrow();
        poll.setEmailList(emailList);

        return pollRepository.save(poll);
    }
}
