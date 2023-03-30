package hello.hellospring.service;

import hello.hellospring.domain.Member;
import hello.hellospring.repsitory.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
public class MemberService {
    private final MemberRepository memberRepository; // = new MemoryMemberRepository();

    // cmd + n = constructor
    // 외부에서 객체를 생성해서 넣어주도록 만들어준다.
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }


    /**
     * 회원가입
     * @param member
     * @return
     */
    public Long join(Member member) {
        // 같은 이름이 있는 중복 회원 x
        // 예상 값 중 null이 있다면 Optional 객체를 사용해준다.
        /**
         *Optional<Member> result = memberRepository.findByName(member.getName());
         *         result.ifPresent(m -> {
         *             throw new IllegalAccessException("이미 존재하는 회원입니다.")
         *         }); ==
         */
        validateDuplicateMember(member);

        memberRepository.save(member);
        return member.getId();
    }

    private void validateDuplicateMember(Member member) {
        memberRepository.findByName(member.getName())
                        .ifPresent(m -> {
                            throw new IllegalStateException("이미 존재하는 회원입니다.");
                        });
    }

    /**
     * 전체 회원 조회
     * @return
     */
    public List<Member> findMembers() {
        return memberRepository.findAll();
    }
    // 서비스는 비지니스 언어를 사용해 네이밍을 한다. -> 기획자와 소통을 위해
    // 리포지토리는 개발적인 언어를 사용해 네이밍을 한다.

    /**
     * 개인 회원 조회
     * @param memberId
     * @return
     */
    public Optional<Member> findOne(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
