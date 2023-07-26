package com.example.firstproject.repository;

import com.example.firstproject.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {

    @Query(value = "select * from comment where article_id = :articleId",nativeQuery = true)
    List<Comment> findByArticleId(@Param("articleId") Long articleId);
    // 옛날방식 META_INF 에 xml 파일을 생성하여 작성해야함
    List<Comment> findByNickname(String nickname);

}
