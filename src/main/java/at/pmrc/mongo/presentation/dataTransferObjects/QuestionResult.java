package at.pmrc.mongo.presentation.dataTransferObjects;

import at.pmrc.mongo.model.Question;

public record QuestionResult(Integer _id,
                             Integer user_id,
                             String content,
                             String creation_date) {

    public QuestionResult(Question question) {
        this(question.get_id(), question.getUser_id(), question.getContent(), question.getCreation_date());
    }
}