package com.shop.service;


import com.shop.entity.Member;
import com.shop.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberService implements UserDetailsService {

    private final MemberRepository memberRepository;

    public Member saveMember(Member member){
        validateDuplicateMember(member);
        return memberRepository.save(member);
    }

    private void validateDuplicateMember(Member member) {
        Member findmember = memberRepository.findByEmail(member.getEmail());
        if(findmember != null){
            throw new IllegalStateException("이미 가입된 회원입니다.");
        }
    }


    @Override /*보안된 세션 역할을 한다*/
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Member member = memberRepository.findByEmail(email);
        if(member==null){
            throw new UsernameNotFoundException(email);
        }
        return User.builder() /*로그인시 이메일 비밀번호 유저와 어드민을 가지고있는다. */
                .username(member.getEmail())
                .password(member.getPassword())
                .roles(member.getRole().toString()) /*이거 때문에 header에 'ROLE_ADMIN' 되는것 */
                .build();
    }
}

//UserDetails 객체는 Spring Security 에서 사용자의 인증 및 권한 정보를 나타내는 인터페이스
//loadUserByUsername 메서드는 이 정보를 검색하여 해당 정보를 기반으로
//사용자 인증 및 권한 부여를 수행하기 위해 사용
//이 메서드를 구현하여 사용자 정보를 데이터 베이스에 가져와
//spring Security 의 사용자 인증 및 권한 기능을 활용
