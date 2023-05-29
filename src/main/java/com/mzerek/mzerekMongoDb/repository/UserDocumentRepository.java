package com.mzerek.mzerekMongoDb.repository;

import com.mzerek.mzerekMongoDb.model.UserDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDocumentRepository extends MongoRepository<UserDocument, String> {
}
