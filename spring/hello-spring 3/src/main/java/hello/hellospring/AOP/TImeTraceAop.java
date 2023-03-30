package hello.hellospring.AOP;

import org.apache.catalina.util.ToStringUtil;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

// 스프링 빈에 등록해줘야 한다. 파일에 별도록 등록도 가능하며 @Component도 가능하다.
@Aspect
@Component
public class TImeTraceAop {
    // 공통 관심 사항을 어디에다가 타켓팅을 해줄 것인가를 정해준다.
    // 해당 내용은 패키지의 하위 내용에 모두 적용해라는 의미를 가진다.
    // 첫번째 ..에 클래스명을 넣어주거나 ()안에는 인자를 선택해준다.
    // 메소드 중간 중간 인터셉트를 작용해 호출된다.
    // 메소드 중간 필요한 공통 관심 사항을 적용한다.
    // 대부분 패키지 레벨에서 적용한다. (서비스 측면만 확인하고 싶다면, hello.hellospring.service로 변경하자)
    // 스프링 컨테이너 -> 의존관계로 작동하지만, AOP를 적용하면 가짜 멤버서비스와 같은 프록시를 만든다. -> 스프링 빈에 가짜 스프링 빈을 만든다. -> 가짜 프록시가 끝나면, 실제를 실행한다.
    // 컨트롤러가 프록시를 호출하는 것이다. MemberComtroller가 인젝션될 때, getClass()를 통해 확인할 수 있다.
    @Around("execution(* hello.hellospring..*(..))")
    public Object execute(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        System.out.println("Start: " + joinPoint.toLongString());
        try {
            return joinPoint.proceed();
        } finally {
            long finish = System.currentTimeMillis();
            long timeMs = finish - start;
            System.out.println("END: " + joinPoint.toString() + " " + timeMs + "ms");
        }
    }
}
