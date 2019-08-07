package com.almgergo.chappuishalder.converter;

import com.almgergo.chappuishalder.model.dto.VoteDto;
import com.almgergo.chappuishalder.model.entity.Vote;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * VoteDto to Vote converter
 */
@Component
public class VoteDto2VoteConverter implements Converter<VoteDto, Vote> {

    /**
     * Convert a voteDto to a vote entity
     * @param source
     * @return
     */
    @Override
    public Vote convert(VoteDto source) {
        return Vote.builder().value(source.getValue()).articleUrl(source.getArticleUrl()).build();
    }
}
