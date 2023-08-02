package jpabook.jpashop.controller;

import jpabook.jpashop.domain.Address;
import jpabook.jpashop.domain.Member;
import jpabook.jpashop.service.MemberService;
import jpabook.jpashop.web.MemberForm;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping(value = "members/new")
    public String createForm(Model model){
        model.addAttribute("memberForm", new MemberForm());
        return "members/createMemberForm";
    }
    // new MemberForm() 은 MemberForm 클래스의 인스턴스를 생성하여
    // "MemberForm" 속성으로 전달합니다.
    // 비어있는 MemberForm 객체가 뷰로 전달된다.

    @PostMapping(value = "/members/new")
    public String crete(@Valid MemberForm form, BindingResult result){
        if(result.hasErrors()){
            return "members/createMemberForm";
        }
        Address address = new Address(form.getCity(), form.getStreet(), form.getZipcode());
        Member member = new Member();
        member.setName(form.getName());
        member.setAddress(address);
        memberService.join(member);
        return "redirect:/";
    }
    //@Valid 사용해서 MemberForm 객체를 검증
    //검증 결과는 BindingResult 객체에 저장됩니다.
    //result.hasError()를 사용하여 검증결과 오류 있으면
    //회원 가입 폼(members/creteMemberForm)으로 다시 이동
    //MemberForm 객체에서 입력 받은 도시(City), 거리(Street), 우편번호(Zipcode)
    //정보를 사용하여 Address 객체를 생성
    //Member 객체 생성하여 회원 이름을 MemberForm 객체에서 입력받은 이름을으로 설정
    //앞서 만들었던 'Address' 객체를 회원의 주소 정보로 설정

    //memberService.join(member)를 통해 회원 객체를 회원 가입 처리합니다.

    //회원 목록 조회
    @GetMapping(value = "/members")
    public String list(Model model){
            List<Member> members = memberService.findMembers();
            model.addAttribute("members", members);
            return "members/memberList";
        }

}
