package hello.servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan // 서블릿 자동 등록
@SpringBootApplication
public class ServletApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServletApplication.class, args);
    }
    /*
//    application.properties 의 suffix prefix 내용이 설정을 해줌

    @Bean
    InternalResourceViewResolver internalResourceViewResolver(){
        return new InternalResourceViewResolver("/WEB-INF/views/", ".jsp");
    }
     */

    // @Component 없이 Bean 으로 직접 등록해도 됨
    /*
    @Bean
    SpringMemberFormControllerV1 springMemberFormControllerV1(){
        return new SpringMemberFormControllerV1();
    }
     */
}
