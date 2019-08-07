package com.almgergo.chappuishalder.converter;

import com.almgergo.chappuishalder.model.dto.ArticleDto;
import com.almgergo.chappuishalder.model.entity.Article;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * Article to ArticleDto converter
 */
@Component
public class Article2ArticleDtoConverter implements Converter<Article, ArticleDto> {

    /**
     * Convert an article entity to an articleDto
     * @param source
     * @return
     */
    @Override
    public ArticleDto convert(Article source) {
        return ArticleDto.builder().url(source.getUrl()).voteAverage(source.getVoteAverage()).voteCount(source.getVoteCount()).build();
    }
}
