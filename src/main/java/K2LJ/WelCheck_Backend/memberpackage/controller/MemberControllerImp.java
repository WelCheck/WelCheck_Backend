package K2LJ.WelCheck_Backend.memberpackage.controller;

import K2LJ.WelCheck_Backend.memberpackage.controller.requestdto.SignUpDTO;
import K2LJ.WelCheck_Backend.memberpackage.domain.member.Member;
import K2LJ.WelCheck_Backend.memberpackage.service.MemberService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class MemberControllerImp implements MemberController {

    private final MemberService memberService;

    //**회원가입**//
    //회원가입화면
    @Override
    @GetMapping("/join")
    public String signUp() {
        return "SignUp Screen";
    }

    //회원가입 폼 제출
    @Override
    @PostMapping("/join")
    public String signUp(@Validated SignUpDTO signUpDTO, BindingResult bindingResult) {
        log.info("access client for SignUp");
        if (bindingResult.hasErrors()) {
            log.info("failed by errorOfFormData");
            return "SignUp Fail";   //폼 입력값 오류로 인한 실패
        }

        //아이디 중복 검증 로직
        boolean duplicatedUserId = memberService.validateMemberId(signUpDTO.getUserId());
        if (duplicatedUserId) {
            log.info("failed by duplicatedUserId");
            return "SignUp Fail";   //유저 id 중복으로 인한 실패
        }

        //username 중복 검증 로직
        boolean duplicatedUsername = memberService.validateUsername(signUpDTO.getUsername());
        if (duplicatedUsername) {
            log.info("failed by duplicatedUsername");
            return "SignUp Fail"; //username 중복으로 인한 실패
        }

        //회원 저장
        Member saveMember = memberService.saveMember(signUpDTO);

        log.info("success SignUp");
        return "SignUp Success";
    }

    //**로그인**//
    //로그인화면
    @Override
    @GetMapping("/login")
    public String signIn() {
        return "LogIn Screen";
    }
}
