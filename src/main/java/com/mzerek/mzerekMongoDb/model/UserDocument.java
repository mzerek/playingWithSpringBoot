package com.mzerek.mzerekMongoDb.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Data
@Builder
@Document("userDocument")
public class UserDocument {
    @Id
    private String userId;

    private String name;

    @Builder.Default
    private Date creationDate = new Date();

    @Builder.Default
    private Map<String, String> userSettings = new HashMap<>();
}
