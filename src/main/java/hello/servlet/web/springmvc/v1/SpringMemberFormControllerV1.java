package hello.servlet.web.springmvc.v1;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//@Component // 1. Spring Bean 등록
//@RequestMapping// 2. Request Mapping 이 클래스에 있으면 핸들러로 인식
@Controller //Controller 어노테이션 안에 @Component 가 포함 되어 있다.
public class SpringMemberFormControllerV1 {
    @RequestMapping("/springmvc/v1/members/new-form")
    public ModelAndView process() {
        return new ModelAndView("new-form");
    }
}
