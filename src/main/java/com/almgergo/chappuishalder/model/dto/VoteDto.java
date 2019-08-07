package com.almgergo.chappuishalder.model.dto;

import lombok.Data;

/**
 * Vote Dto
 */
@Data
public class VoteDto {
    /**
     * Value of the vote on a scale of 0-10
     */
    private Double value;

    /**
     * The vote's article's url
     */
    private String articleUrl;
}
