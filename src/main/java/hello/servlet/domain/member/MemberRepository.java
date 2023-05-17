package hello.servlet.domain.member;

import org.springframework.util.StreamUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 동시성 문제가 고려되지 않으므로, 실무에서는 ConcurrentHashMap, AtomicLong 사용 고려
 * 프로젝트가 작으므로 Member 패키지 안에 넣음
 */
public class MemberRepository {

    private Map<Long, Member> store = new HashMap<>();
    private long sequence = 0L;

    private static final MemberRepository instance = new MemberRepository();

    public static MemberRepository getInstance(){
        return instance;
    }
    private MemberRepository() {
    }

    public Member save(Member member){
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    }

    public Member findById(Long id){
        return store.get(id);
    }
    public List<Member> findAll() {
        // store 보호를 위해 새 인스턴스로 리턴
        return new ArrayList<>(store.values());
    }

    public void clearStore(){
        store.clear();
    }


}
