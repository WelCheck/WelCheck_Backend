package K2LJ.WelCheck_Backend.memberpackage.controller;

import K2LJ.WelCheck_Backend.memberpackage.controller.requestdto.SignUpDTO;
import org.springframework.validation.BindingResult;

public interface MemberController {

    //**회원가입**//
    //GetMapping
    public String signUp();
    //PostMapping
    public String signUp(SignUpDTO signUpDTO, BindingResult bindingResult);

    //**로그인**//
    //GetMapping
    public String signIn();
    //PostMapping
    //스프링시큐리티에서 구현됨

    //아이디 찾기

    //비밀번호 찾기


}
