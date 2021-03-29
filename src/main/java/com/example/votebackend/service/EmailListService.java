package com.example.votebackend.service;

import com.example.votebackend.entities.EmailList;
import com.example.votebackend.entities.dto.admin.request.EmailListRequest;
import java.util.List;
import java.util.Set;

public interface EmailListService {
    Set<EmailList> getAll();

    EmailList create(EmailListRequest emailListRequest);

    EmailList update(Long id, EmailListRequest emailListRequest);

    void delete(Long id);
}
