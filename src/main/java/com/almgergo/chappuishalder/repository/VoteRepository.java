package com.almgergo.chappuishalder.repository;

import com.almgergo.chappuishalder.model.entity.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Vote repository
 */
public interface VoteRepository extends JpaRepository<Vote, Long> {
}
