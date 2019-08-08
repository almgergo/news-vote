package com.almgergo.chappuishalder.model.dto;

import lombok.Data;

/**
 * Vote Dto
 */
@Data
public class VoteDto {
    /**
     * Id of the vote, if not null then it is a modified vote
     */
    private Long id;

    /**
     * Value of the vote on a scale of 0-10
     */
    private Double value;

    /**
     * The vote's article's url
     */
    private String articleUrl;
}
