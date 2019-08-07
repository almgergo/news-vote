package com.almgergo.chappuishalder.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class ArticleDto {
    private String url;
    private Long voteCount;
    private Double voteAverage;
}
