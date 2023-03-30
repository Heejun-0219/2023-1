package hello.hellospring.service;

import hello.hellospring.domain.Member;
import hello.hellospring.repsitory.MemberRepository;
import hello.hellospring.repsitory.MemoryMemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
// cmd + shift + t | create new test
class MemberServiceTest {

    MemberService memberService;
    //MemoryMemberRepository memberRepository = new MemoryMemberRepository();
    // static이라서 클래스 단위로 객체가 생성되지만, new로 다른 객체가 생성이 될 경우 다른 인스턴스이기 때문에 내용이 달라질 수 있다.
    MemoryMemberRepository memberRepository;
    @BeforeEach
    public void berforeEach(){
        memberRepository = new MemoryMemberRepository();
        memberService = new MemberService(memberRepository);
    }
    // 같은 메모리 리포지토리를 사용하기 위해서
    // 멤버서비스 입장에서 직접 만들지 않고 외부에서 멤버리포지토리를 넣어준다.
    // DI = 디펜더시 인젝션이라고 한다.

    // ctrl + r 이전 실행 다시 실행
    @AfterEach
    public void afterEach() {
        memberRepository.clearStore();
    }
    @Test
        // 테스트는 영어로 변경하자
    void 회원가입() {

        // given
        Member member = new Member();
        member.setName("hello");

        // when
        Long saveId = memberService.join(member);

        // then
        Member findMember = memberService.findOne(saveId).get();
        assertThat(member.getName()).isEqualTo(findMember.getName());
        // static import로 넘기기 option + enter
    }
    // 테스트 기법 given when then 주석까지 사용하기

    @Test
    public void 중복_회원_예외() {
        //given
        Member member1 = new Member();
        member1.setName("spring");

        Member member2 = new Member();
        member2.setName("spring");

        //when
        memberService.join(member1);
        // cmd + option + v = 변수 자동 생성
        IllegalStateException e = assertThrows(IllegalStateException.class, () -> memberService.join(member2));
        assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");
        /**try {
            memberService.join(member2);
            fail();
        } catch (IllegalStateException e) {
            //assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");
        }*/
        //then
    }
    @Test
    void findMember() {
    }

    @Test
    void findOne() {
    }

}