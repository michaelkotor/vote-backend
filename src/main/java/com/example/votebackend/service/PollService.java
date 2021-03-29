package com.example.votebackend.service;

import com.example.votebackend.entities.Poll;
import com.example.votebackend.entities.dto.admin.PollDraftDto;
import com.example.votebackend.entities.dto.admin.request.PollDraftRequest;
import com.example.votebackend.entities.dto.vote.PollCastDto;
import com.example.votebackend.entities.dto.admin.request.CastRequest;
import java.util.List;

public interface PollService {
    PollCastDto vote(Long id, CastRequest castRequest);

    Poll createDraft(PollDraftRequest pollDraftRequest);

    Poll updateDraft(Long id, PollDraftRequest pollDraftRequest);

    Poll publish(Long id);

    List<Poll> getAll();

    Poll get(Long id);
}
