package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "home";
    }
}
// 정적 컨텐츠 우선순위
// 1. 스프링 컨테이너
// 2. 스테틱 파일