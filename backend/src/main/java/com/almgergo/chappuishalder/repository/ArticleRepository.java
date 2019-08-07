package com.almgergo.chappuishalder.repository;

import com.almgergo.chappuishalder.model.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Article repository
 */
public interface ArticleRepository extends JpaRepository<Article, String> {
}
