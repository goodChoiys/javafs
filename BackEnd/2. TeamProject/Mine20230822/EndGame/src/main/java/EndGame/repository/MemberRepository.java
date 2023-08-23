package EndGame.repository;

import EndGame.entity.Car;
import EndGame.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;


public interface MemberRepository extends JpaRepository<Car, Long> {
    Member findByEmail(String email);
}
