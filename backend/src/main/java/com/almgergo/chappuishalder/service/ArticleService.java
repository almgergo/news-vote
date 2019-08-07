package com.almgergo.chappuishalder.service;

import com.almgergo.chappuishalder.model.entity.Article;
import com.almgergo.chappuishalder.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {
    @Autowired
    private ArticleRepository articleRepository;

    public List<Article> getArticles() {
        return this.articleRepository.findAll();
    }
}
