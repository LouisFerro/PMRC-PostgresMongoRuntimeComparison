package at.pmrc.postgres.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import at.pmrc.postgres.model.Vote;

@Repository("postgresVoteRepository")
public interface VoteRepository extends JpaRepository<Vote, Integer> {
}