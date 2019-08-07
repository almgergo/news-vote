package com.almgergo.chappuishalder.model.entity;

import lombok.Data;
import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Article virtual entity.
 * Because of no other data needs to be stored for articles other than their votes, it's stored in a view instead of a table
 */
@Entity
@Data
@Immutable
@Subselect("SELECT article_url as url, count(*) as vote_count, avg(value) as vote_average from vote GROUP BY article_url")
public class Article {

    @Id
    private String url;

    private Long voteCount;
    private Double voteAverage;
}
