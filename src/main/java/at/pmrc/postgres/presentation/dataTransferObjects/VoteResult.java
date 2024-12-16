package at.pmrc.postgres.presentation.dataTransferObjects;

import at.pmrc.mongo.model.Vote;

public record VoteResult(int _id,
                         int user_id,
                         int question_id,
                         boolean upvote) {

    public VoteResult(Vote vote) {
        this(vote.get_id(), vote.getUser_id(), vote.getQuestion_id(), vote.isUpvote());
    }
}