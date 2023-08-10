package com.shop.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@EntityListeners(value = {AuditingEntityListener.class}) // 생성일과 수정일 자동관리
@MappedSuperclass // 다른 엔티티 클래스에서 상속 받아 사용할 수 있다.
@Getter
@Setter
public abstract class BaseTimeEntity { /* 추상클래스 지정 */
    @CreatedDate // 엔티티가 생성될때 해당 필드에 자동으로 생성일을 저장
    @Column(updatable = false) // 업데이트 되지 않도록
    private LocalDateTime regTime;
    @LastModifiedDate // : JPA 의 Auditing 기능으로, 엔티티가 수정될 때 해당 필드에 자동으로 수정일을
    private LocalDateTime updateTime;
}
