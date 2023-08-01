package EndGame.teamPJ.reposiotry;

import EndGame.teamPJ.entity.Member;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class MemberRepository {

    @PersistenceContext
    EntityManager em;

    // 회원 저장
    public Long save(Member member){
        em.persist(member);
        return member.getId();
    }

    // 회원 찾기
    public Member find(Long id){
        return em.find(Member.class, id);
    }

}
