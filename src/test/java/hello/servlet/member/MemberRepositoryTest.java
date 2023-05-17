package hello.servlet.member;

import hello.servlet.domain.member.Member;
import hello.servlet.domain.member.MemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

//junit 5 부터 public 필요 X
class MemberRepositoryTest {
    // Spring Bean 을 쓰면 싱글톤을 보장해주므로 필요없다.
    MemberRepository memberRepository = MemberRepository.getInstance();

    @AfterEach
    void afterEach(){
        //테스트 끝난 후 초기화
        memberRepository.clearStore();
    }

    @Test
    void save(){
        //given
        Member member = new Member("hello", 20);
        //when
        Member savedMember = memberRepository.save(member);

        //then
        Member findMember = memberRepository.findById(savedMember.getId());
        Assertions.assertThat(findMember).isEqualTo(savedMember);

    }

}