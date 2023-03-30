    package hello.hellospring.controller;

    import hello.hellospring.domain.Member;
    import hello.hellospring.service.MemberService;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Controller;
    import org.springframework.ui.Model;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.PostMapping;

    import java.util.List;

    // 프로그램이 시작하면 스프링 컨테이너와 통이 생기게 된다. 거기에 멤버컨트롤러를 생성에 넣어둔다. 그리고 스프링이 관리한다.
    // 메인 애플리케이션 패키지를 포함한 동위레벨 및 하위레벨의 폴더는 스프링 빈이 자동으로 스캔하여 의존관계를 파악한다.
    @Controller // Component 포함
    // Component를 포함하고 있을 경우, 프로그램을 실행하면 각각 객체를 하나씩 만들어 스프링 컨테이너에 등록한다.
    public class MemberController {

        private final MemberService memberService;

        @Autowired // 스프링 컨테이너에 있는 멤버서비스 객체와 연결시켜준다. 결국 하나의 객체로만 작동하게 되는 것이다.
        // 해당 클래스에 각각 서비스와 리포지토리를 붙여준다.
        // 컨트롤러, 서비스, 리포지토리라는 정형화된 형태를 가진다.
        // 컨트롤러를 통해 외부입력을 받고, 서비스를 통해서 비즈니스 로직을 만들고, 리포지토리에서 데이터를 저장한다.
        // 디펜던시 인젝션, 의존관계를 주입해준다.
        public MemberController(MemberService memberService) {
            this.memberService = memberService;
        }

        // http의 get방식으로 주소에 직접입력하여 매핑된다.
        // 리턴값인 템플릿을 확인하고 출력한다.
        @GetMapping("/members/new")
        public String creatForm() {
            return "members/createMemberForm";
        }

        // 매개변수를 통해서 post 방식으로 들어온 값을 가져올 수 있다.
        @PostMapping("/members/new")
        public String create(MemberForm form) {
            Member member = new Member();
            member.setName(form.getName());

            memberService.join(member);

            return "redirect:/";
        }

        @GetMapping("/members")
        public String list(Model model) {
            List<Member> members = memberService.findMembers();
            model.addAttribute("members", members);
            return "/members/memberList";
        }
    }
