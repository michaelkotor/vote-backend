package com.example.votebackend.controllers.admin;

import com.example.votebackend.entities.EmailList;
import com.example.votebackend.entities.dto.admin.request.EmailListRequest;
import com.example.votebackend.service.EmailListService;
import java.util.Set;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
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
public class EmailListController {
    private final EmailListService emailListService;

    @GetMapping("/email-lists")
    public ResponseEntity<Set<EmailList>> getAllEmailLists() {
        return new ResponseEntity<>(emailListService.getAll(), HttpStatus.OK);
    }

    @PostMapping("/email-lists")
    public ResponseEntity<EmailList> createEmailList(@RequestBody EmailListRequest emailListRequest) {
        return new ResponseEntity<>(emailListService.create(emailListRequest), HttpStatus.CREATED);
    }

    @PutMapping("/email-lists")
    public ResponseEntity<EmailList> updateEmailLists(@RequestParam Long id, @RequestBody EmailListRequest emailListRequest) {
        return new ResponseEntity<>(emailListService.update(id, emailListRequest), HttpStatus.OK);
    }

    @DeleteMapping("/email-lists")
    public ResponseEntity<Void> deleteEmailList(@RequestParam Long id) {
        emailListService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }




}
