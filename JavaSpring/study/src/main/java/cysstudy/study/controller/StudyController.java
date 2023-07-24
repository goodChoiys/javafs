package cysstudy.study.controller;

import cysstudy.study.dto.ArticleForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudyController {
    @GetMapping("/articles/testPage")
    public String newArticleForm() {
        return "articles/testPage";
    }
    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form) {
        System.out.println(form.toString());
        return "";
    }
}

