package hello.hellospring.repsitory;

import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// 기본 기능을 제공해준다. findById, save, count 등등
// CRUD 기능을 모두 제공
// 공통 인터페이스만 제공하기 때문에 추가한 객체는 추가 함수를 만들어야 한다. ex) name
public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {
    // selet m from Member m where m.name = ?의 방식으로 쿼리를 만들어준다. -> JPOL로 번역된다.
    // findBy로 시작하기 때문에 가능한 일
    @Override
    Optional<Member> findByName(String name);

    // And Or 등등 추가할 수 있다.
    // 인터페이스 이름으로 개발을 마무리할 수 있다.
}
