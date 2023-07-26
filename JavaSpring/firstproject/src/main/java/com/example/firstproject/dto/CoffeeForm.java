package com.example.firstproject.dto;

import com.example.firstproject.entity.Coffee;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor // 기본 생성자 추가
@ToString
public class CoffeeForm {
    private Long id;
    private String title;
    private String content;

    public CoffeeForm(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public Coffee toEntity() {
        return new Coffee(id, title, content);
    }

    // Getter and Setter methods (if needed) for the fields
}