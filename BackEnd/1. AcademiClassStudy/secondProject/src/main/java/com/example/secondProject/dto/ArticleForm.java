package com.example.secondProject.dto;

import com.example.secondProject.entity.Article;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class ArticleForm {
    private Long id;
    private String title;
    private String content;


    // update를 위한 dto 변경 - id 필드 추가 및 엔티티 변환 메소드 변경
    public Article toEntity() {
        return new Article(id, title, content);
    }
}
