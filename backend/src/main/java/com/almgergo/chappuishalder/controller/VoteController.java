package com.almgergo.chappuishalder.controller;

import com.almgergo.chappuishalder.converter.VoteDto2VoteConverter;
import com.almgergo.chappuishalder.model.dto.VoteDto;
import com.almgergo.chappuishalder.model.entity.Vote;
import com.almgergo.chappuishalder.service.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Vote controller
 */
@Controller
public class VoteController extends ApiController {

    @Autowired
    private VoteDto2VoteConverter voteDto2VoteConverter;

    @Autowired
    private VoteService voteService;

    @PostMapping("/votes")
    @ResponseBody
    public Long recordVote(@RequestBody(required = true) VoteDto voteDto) {
        return this.voteService.saveVote(this.voteDto2VoteConverter.convert(voteDto)).getId();
    }
}

