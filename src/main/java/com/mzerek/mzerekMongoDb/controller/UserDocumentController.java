package com.mzerek.mzerekMongoDb.controller;

import com.mzerek.mzerekMongoDb.service.UserDocumentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/user-document")
public class UserDocumentController {

    private final UserDocumentService userDocumentService;

    @GetMapping("/some-create")
    public void createSomeExampleUserDocument() {
        userDocumentService.createSomeExampleUserDocument();
    }
}
