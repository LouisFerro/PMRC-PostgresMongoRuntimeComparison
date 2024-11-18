package at.pmrc.mongo.persistence.repositories;

import at.pmrc.mongo.model.Question;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository("mongoQuestionRepository")
public interface QuestionRepository extends MongoRepository<Question, ObjectId> {
}
