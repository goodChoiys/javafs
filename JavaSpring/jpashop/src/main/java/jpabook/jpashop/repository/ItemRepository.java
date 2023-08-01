package jpabook.jpashop.repository;

import jpabook.jpashop.domain.item.Item;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class ItemRepository {
    private final EntityManager em; // 무조건 넣어줘야

    public void save(Item item){
        if(item.getId() == null){
            em.persist(item);
        }else{
            em.merge(item);
        }
    }
    // em.merge(item)
    // merge 메서드를 사용하여 이미 존재하는 item 엔티티를
    // 데이터 베이스에 업데이트 한다.
    // merge 메서드는 엔티티를 영속성 컨텍스트에 병합하는 역할을 한다.

    public Item findOne(Long id){
        return em.find(Item.class, id);
    }

    public List<Item> findAll(){
        return em.createQuery("select i form Item i", Item.class)
                .getResultList();
    }

}
