package com.mzerek.mzerekMongoDb.service;

import com.mzerek.mzerekMongoDb.model.UserDocument;
import com.mzerek.mzerekMongoDb.repository.UserDocumentRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
@Service
public class UserDocumentService {

    private final UserDocumentRepository userDocumentRepository;

    public void createSomeExampleUserDocument() {
        System.out.println("Data creation started...");
        Map<String, String> someSettings = new HashMap<>();
        someSettings.put("One", "Fist setting");
        someSettings.put("Two", "Second setting");
        userDocumentRepository.save(UserDocument.builder()
                        .name("Test1")
                        .userSettings(someSettings)
                .build());
        userDocumentRepository.save(UserDocument.builder()
                .name("Test2")
                .userSettings(someSettings)
                .build());
        System.out.println("Data creation complete...");
    }
}
