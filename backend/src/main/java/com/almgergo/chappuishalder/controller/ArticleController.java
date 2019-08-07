package com.almgergo.chappuishalder.controller;

import com.almgergo.chappuishalder.converter.Article2ArticleDtoConverter;
import com.almgergo.chappuishalder.model.dto.ArticleDto;
import com.almgergo.chappuishalder.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Article controller
 */
@Controller
public class ArticleController extends ApiController {

    @Autowired
    private Article2ArticleDtoConverter article2ArticleDtoConverter;

    @Autowired
    private ArticleService articleService;


    @GetMapping("/articles")
    @ResponseBody
    public List<ArticleDto> getArticles() {
        System.out.println();
        return this.articleService.getArticles().stream().map(this.article2ArticleDtoConverter::convert).collect(Collectors.toList());
    }
}
