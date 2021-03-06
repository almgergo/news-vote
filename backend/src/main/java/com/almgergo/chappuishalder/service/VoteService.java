package com.almgergo.chappuishalder.service;

import com.almgergo.chappuishalder.model.entity.Vote;
import com.almgergo.chappuishalder.repository.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Vote service
 */
@Service
public class VoteService {

    @Autowired
    private VoteRepository voteRepository;

    public Vote saveVote(Vote vote) {
        return this.voteRepository.save(vote);
    }

}
