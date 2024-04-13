package K2LJ.WelCheck_Backend.memberpackage.controller;

import K2LJ.WelCheck_Backend.memberpackage.controller.requestdto.SignInDTO;
import K2LJ.WelCheck_Backend.memberpackage.controller.requestdto.SignUpDTO;
import org.springframework.validation.BindingResult;

public interface MemberController {

    //회원가입
    public String signUp(SignUpDTO signUpDTO, BindingResult bindingResult);

    //로그인
    public String signIn(SignInDTO signInDTO, BindingResult bindingResult);

    //아이디 찾기

    //비밀번호 찾기

}
