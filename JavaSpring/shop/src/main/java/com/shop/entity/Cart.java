package com.shop.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "cart")
@Getter
@Setter
@ToString
public class Cart extends BaseEntity{
    @Id
    @Column(name = "cart_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /*조회시 대상이 전체인지 특정 요소인지에 대해 정하기 때문에 구동되는 속도에 영향이 큼*/
    @OneToOne(fetch = FetchType.LAZY)/*(fetch = FetchType.LAZY), (fetch = FetchType.EAGER)*/
    @JoinColumn(name = "member_id")
    private Member member;

    public static Cart createCart(Member member){
        Cart cart = new Cart();
        cart.setMember(member);
        return cart;
    }
}
