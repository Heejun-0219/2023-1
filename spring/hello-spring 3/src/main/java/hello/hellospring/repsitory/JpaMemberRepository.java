package hello.hellospring.repsitory;

import hello.hellospring.domain.Member;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.List;
import java.util.Optional;

public class JpaMemberRepository implements MemberRepository{

    // 스프링 부터가 엔티티매니저를 만들어준다. 현재 데이터베이스와 연동까지 우리는 만들어진 것을 인젝션해주면 된다.
    // jpa를 사용하기 위해서는 엔티티매니저를 주입받아야 한다.
    private final EntityManager em;

    public JpaMemberRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public Member save(Member member) {
        // 이렇게 하면 set까지 다해준다.
        em.persist(member);
        return member;
    }

    @Override
    public Optional<Member> findById(Long id) {
        Member member = em.find(Member.class, id);
        return Optional.ofNullable(member);
    }

    @Override
    public Optional<Member> findByName(String name) {
        // 조회 및 업데이트의 쿼리를 작성할 필요없다.
        List<Member> result = em.createQuery("select m from Member m where m.name = :name", Member.class)
                .setParameter("name", name)
                .getResultList();

        return result.stream().findAny();
    }

    @Override
    public List<Member> findAll() {
        // 객체를 대상으로 쿼리를 날린다. 그러면 SQL로 번역이 된다. 멤버 엔티티를 대상으로 쿼리를 날린다.
        // *를 사용하지 않고 객체 자체를 조회한다.
        // 데이터를 찾아서 맵핑할 필요없다.
        return em.createQuery("select m from Member m", Member.class)
                .getResultList();
    }
}
