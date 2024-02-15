package kr.re.nrf.kri.domain.accounts;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MemberTest {
    @Autowired
    private MemberRepository memberRepository;

    @Test
     void save() {

        Member member = Member.builder()
                .name("lee")
                .webId("lee")
                .password("1234")
                .build();

        Member savedMember = memberRepository.save(member);

        assertEquals(member.getName(), savedMember.getName());
    }

    @Test
    void select(){

    }

}