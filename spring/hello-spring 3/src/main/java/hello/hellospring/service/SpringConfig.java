package hello.hellospring.service;

import hello.hellospring.AOP.TImeTraceAop;
import hello.hellospring.repsitory.*;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.preprocessor.IPreProcessor;

import javax.sql.DataSource;

@Configuration // 어노테이션을 사용해서 직접 스프링 빈에 대입해준다.
public class SpringConfig {

    /* private DataSource dataSource;

    @Autowired
    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    // 스플링 빈에 저장하지 않으면 @Autowired 어노테이션을 사용해도 작동하지 않는다.
     */

    /* private EntityManager em;

    @Autowired
    public SpringConfig(EntityManager em) {
        this.em = em;
    }
     */

    private final MemberRepository memberRepository;

    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }

    /*
    @Bean
    // TimetraceAOP
    public TImeTraceAop tImeTraceAop() {
        return new TImeTraceAop();
    }
     */
    /*
    @Bean
    public MemberRepository memberRepository() {
        //return new JdbcMemberRepository(dataSource);
        //return new MemoryMemberRepository();
        //return new JdbcTemplateMemberRepository(dataSource);
        // return new JpaMemberRepository(em);
    }
     */
}

/*
 디펜던시 인젝션에는 3가지 방법이 있다.
    생성자를 통해서 들어오는 방법 -> 추천
    필들에 바로 @Autowired를 사용해 필드주입을 하는 방법 -> 추가 설정 불가능
    세터를 통해서 주입하는 방법 -> 퍼블릭으로 생성하여 외부에서 호출되었을때, 객체가 생성되어야 하는데, 퍼블릭으로 생성되었기 때문에 프로그램 실행하는 중간에 다시 실행될 경우 초기화될 수 있다.
 */
