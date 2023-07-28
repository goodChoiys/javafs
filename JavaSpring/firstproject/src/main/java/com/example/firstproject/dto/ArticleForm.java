package com.example.firstproject.dto;


import com.example.firstproject.entity.Article;
import com.example.firstproject.entity.Comment;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
//@NoArgsConstructor
@ToString
public class ArticleForm {
    private Long id;
    private String title;
    private String content;
//    private List<Comment> comments;
//    update를 위한 dto 변경 - id 필드 추가 및 엔티티 변환 메소드변경

    //    public ArticleForm(String title, String content) {
//        this.title = title;
//        this.content = content;
//    }
//    public Article toEntity() {
//        return new Article(id, title, content, comments);
//    }
    public Article toEntity() {
        return new Article(id, title, content);
    }
//    toEntity() 메소드는 새로운 Article 을 생성하는데, 기본인 id는 null 설정 : 이유 : title 과 content 는
//    form(우리에겐 dto) 으로 받아옴 근데 id 는 없어서 null 로 임시로 비워둠 null 자리에 자동으로 고유 아이디를 만들 것이다.

//    dto - data transfer object 데이터 전송 객체
//    계층들 사이에서 데이터를 간단하고 구조화된 방식으로 캡슐화하고 전고하는 것

}