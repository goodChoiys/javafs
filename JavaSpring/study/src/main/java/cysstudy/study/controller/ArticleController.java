package cysstudy.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {
    @GetMapping("/articles/testPage")
    public String InputArticleForm() {
        return "articles/testPage";
    }

    @PostMapping("/articles/create")
    public String createArticle() {
        return "";
    }

}
