package K2LJ.WelCheck_Backend.memberpackage.controller;

import K2LJ.WelCheck_Backend.memberpackage.controller.requestdto.SignInDTO;
import K2LJ.WelCheck_Backend.memberpackage.controller.requestdto.SignUpDTO;
import K2LJ.WelCheck_Backend.memberpackage.domain.member.Member;
import K2LJ.WelCheck_Backend.memberpackage.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class MemberControllerImp implements MemberController{

    private final MemberService memberService;

    //회원가입
    @Override
    @PostMapping("/members")
    public String signUp(@Validated SignUpDTO signUpDTO, BindingResult bindingResult) {
        log.info("access client for SignUp");
        if (bindingResult.hasErrors()) {
            log.info("failed by errorOfFormData");
            return "SignUp Fail";   //폼 입력값 오류로 인한 실패
        }

        //아이디 중복 검증 로직
        boolean duplicateUserId = memberService.validateMemberId(signUpDTO.getUserId());
        if(duplicateUserId){
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

    //로그인
    @Override
    @PostMapping("/login")
    public String signIn(@Validated SignInDTO signInDTO, BindingResult bindingResult) {
        log.info("access client for SignIn");

        if (bindingResult.hasErrors()) {
            log.info("failed to SignIn");
            log.info("errors={}", bindingResult.getAllErrors());
            return "LogIn Fail";
        }

        log.info("success Login");
        return "LogIn Success";
    }
}
