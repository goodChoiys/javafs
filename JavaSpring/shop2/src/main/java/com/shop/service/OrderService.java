package com.shop.service;

import com.shop.dto.OrderDto;
import com.shop.dto.OrderHistoryDto;
import com.shop.dto.OrderItemDto;
import com.shop.entity.*;
import com.shop.repository.ItemImgRepository;
import com.shop.repository.ItemRepository;
import com.shop.repository.MemberRepository;
import com.shop.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class OrderService {

    private final ItemRepository itemRepository;
    private final MemberRepository memberRepository;
    private final OrderRepository orderRepository;
    private final ItemImgRepository itemImgRepository;


    public Long order(OrderDto orderDto, String email) {
        //주문하려는 아이템 itemRepository 에서 아이템 Id를 조회하고
        //존재하지 않으면 EntityNotFoundException::new
        Item item = itemRepository.findById(orderDto.getItemId())
                .orElseThrow(EntityNotFoundException::new);

        //주문자
        //주문을 생성하는 회원 memberRepository 에서 이메일을 이용해 조회
        Member member = memberRepository.findByEmail(email);

        //주문이 여러개일 경우를 위해 리스트화
        List<OrderItem> orderItemList = new ArrayList<>();
        //주문 항목을 생성 OrderItem 클래스의 createOrderItem 메서드를 호출해서 주문항목을 생성
        OrderItem orderItem = OrderItem.createOrderItem(item, orderDto.getCount());
        //주문 리스트에 주문항목과 주문수량을 추가
        orderItemList.add(orderItem);
        //주문을 생성 (createOrder 메서드 호출)
        Order order = Order.createOrder(member, orderItemList);
        //주문 내역을 데이터베이스(orderRepository)에 저장
        orderRepository.save(order);
        //생성된 주문 id를 반환
        return order.getId();
    }

    @Transactional(readOnly = true)
    public Page<OrderHistoryDto> getOrderList(String email, Pageable pageable){
        List<Order> orders = orderRepository.findOrders(email, pageable);
        // 주문 레포지토리에서 입력 받은 메일 주소와 페이징 정보를 기반으로 주문 목록 조회
        Long totalCount = orderRepository.countOrder(email);
        // 유저의 주문 총 개수를 구합니다.
        List<OrderHistoryDto> orderHistoryDtos = new ArrayList<>();

        for(Order order : orders){
            // 조회된 주문 목록을 순회하면서 각 주문에 대한 정보를 OrderHistDto 로 변환
            OrderHistoryDto orderHistoryDto = new OrderHistoryDto(order);
            List<OrderItem> orderItems = order.getOrderItems();
            // 해당 주문에 속한 모든 주문 항목을 조회
            for (OrderItem orderItem : orderItems){
                // 조회된 주문 항목을 순회하면서
                ItemImg itemImg = itemImgRepository.findByItemIdAndRepimgYn
                        (orderItem.getItem().getId(),"Y");
                // 대표이미지 조회
                OrderItemDto orderItemDto =
                        new OrderItemDto(orderItem, itemImg.getImgUrl());
                // orderItem 과 이미지 주소 조회
                orderHistoryDto.addOrderItemDto(orderItemDto);
                // 생성된 orderItemDto 를 orderHistDto 리스트에 추가
            }
            orderHistoryDtos.add(orderHistoryDto);    // orderHistDto 리스트에 추가
        }

        return new PageImpl<OrderHistoryDto>(orderHistoryDtos, pageable, totalCount);
        // 생성된 orderHistDtos 리스트를 페이징 처리하여 반환
    }

}