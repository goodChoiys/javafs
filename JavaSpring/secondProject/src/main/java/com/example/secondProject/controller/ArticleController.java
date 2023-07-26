package com.example.secondProject.controller;

import com.example.secondProject.dto.ArticleForm;
import com.example.secondProject.entity.Article;
import com.example.secondProject.repository.ArticleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j // 로깅을 위한 롬복 어노테이션
public class ArticleController {

    @Autowired
    private ArticleRepository articleRepository;

    @GetMapping("/articles/new")
    public String newArticleForm() {
        return "articles/new";
    }

    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form) {
        log.info(form.toString());    // println() 을 로깅으로 대체!

        Article article = form.toEntity();
        log.info(article.toString()); // println() 을 로깅으로 대체!

        Article saved = articleRepository.save(article);
        log.info(saved.toString());   // println() 을 로깅으로 대체!

        return "";
    }
}
