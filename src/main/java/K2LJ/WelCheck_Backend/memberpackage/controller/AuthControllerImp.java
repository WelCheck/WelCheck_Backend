package K2LJ.WelCheck_Backend.memberpackage.controller;

import K2LJ.WelCheck_Backend.memberpackage.controller.requestdto.SignUpDTO;
import K2LJ.WelCheck_Backend.memberpackage.domain.member.Member;
import K2LJ.WelCheck_Backend.memberpackage.service.AuthService;
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
public class AuthControllerImp implements AuthController {

    private final AuthService authService;

    //**회원가입**//
    //회원가입화면
    @Override
    @GetMapping("/join")
    public String signUp() {
        return "SignUp Screen";
    }

    @Override
    @GetMapping("/join/GeneralMember")
    public String GeneralMemberSignUp() {
        return "GeneralMember SignUp Screen";
    }

    @Override
    @GetMapping("/join/disabledMember")
    public String disabledMemberSignUp() {
        return "DisabledMember SignUp Screen";
    }

    @Override
    @GetMapping("/join/WelfareWorkerMember")
    public String WelfareWorkerMemberSignUp() {
        return "WelfareWorkerMember SignUp Screen";
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
        boolean duplicatedUserId = authService.validateMemberId(signUpDTO.getUserId());
        if (duplicatedUserId) {
            log.info("failed by duplicatedUserId");
            return "SignUp Fail";   //유저 id 중복으로 인한 실패
        }

        //username 중복 검증 로직
        boolean duplicatedUsername = authService.validateUsername(signUpDTO.getUsername());
        if (duplicatedUsername) {
            log.info("failed by duplicatedUsername");
            return "SignUp Fail"; //username 중복으로 인한 실패
        }

        //회원 저장
        Member saveMember = authService.saveMember(signUpDTO);

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

    //jwt 로그인 인가 테스트 경로
    @GetMapping("/mypage")
    public String myPage() {
        return "my page";
    }

    //테스트용 임시 welcome 페이지
    @GetMapping("/")
    public String welcomeP(){
        return "welcome";
    }
}
