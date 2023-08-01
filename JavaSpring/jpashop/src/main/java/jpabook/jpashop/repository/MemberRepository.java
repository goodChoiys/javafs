package jpabook.jpashop.repository;

import jpabook.jpashop.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
@RequiredArgsConstructor // final 필드가 붙은 필드 인자를 받는 생성자가 자동으로 생성
public class MemberRepository {

    private final EntityManager em; // final 필드가 붙은 필드 인자

    public void save(Member member) {
        em.persist(member);
    }

    public Member findOne(Long id) {
        return em.find(Member.class, id);
    }

    /*
    방법1

        public List<Member> findAll(){
        TypedQuery<Member> query = em.createQuery("select m from Member m", Member.class);
        List<Member> result = query.getResultList();
        return result;}
    */

    /*
    방법2(JPA방식에서의 간소화)
    */

    public List<Member> findAll() {
        return em.createQuery("select m from Member m", Member.class)
                .getResultList();
    }


    /*
    방법1
    public List<Member> findByName(String name) {
        TypedQuery<Member> query = em.createQuery("select m from Member m where m.name = :name", Member.class);
        // 쿼리의 바인딩 변수에 값을 할당합니다.
        query.setParameter("name", name); // 찾을때는 꼭 쓸 것
        List<Member> result = query.getResultList();
        return result;}
    */

    /*
    방법2(JPA방식에서의 간소화)
    */
    public List<Member> findByName(String name) {
        return em.createQuery("select m from Member m where m.name = :name", Member.class)
                .setParameter("name", name)
                .getResultList();

    }


}
