package com.example.votebackend.service.impl;

import com.example.votebackend.entities.EmailList;
import com.example.votebackend.entities.dto.admin.request.EmailListRequest;
import com.example.votebackend.repositories.EmailListRepository;
import com.example.votebackend.service.EmailListService;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmailListServiceImpl implements EmailListService {
    private final EmailListRepository emailListRepository;


    @Override
    public Set<EmailList> getAll() {
        return new HashSet<>(emailListRepository.findAll());
    }

    @Override
    public EmailList create(EmailListRequest emailList) {
        EmailList toSave = new EmailList();
        toSave.setEmails(emailList.getEmails());
        toSave.setCreatedAt(LocalDateTime.now());
        toSave.setUpdatedAt(LocalDateTime.now());
        toSave.setTitle(emailList.getTitle());
        return emailListRepository.save(toSave);
    }

    @Override
    public EmailList update(Long id, EmailListRequest emailListRequest) {
        EmailList toUpdate = emailListRepository.findById(id).orElseThrow();
        toUpdate.setUpdatedAt(LocalDateTime.now());
        toUpdate.setEmails(emailListRequest.getEmails());
        toUpdate.setTitle(emailListRequest.getTitle());
        return emailListRepository.save(toUpdate);
    }

    @Override
    public void delete(Long id) {
        emailListRepository.deleteById(id);
    }
}
