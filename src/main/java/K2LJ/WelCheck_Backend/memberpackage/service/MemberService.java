package K2LJ.WelCheck_Backend.memberpackage.service;

import K2LJ.WelCheck_Backend.memberpackage.controller.requestdto.SignUpDTO;
import K2LJ.WelCheck_Backend.memberpackage.domain.member.Member;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface MemberService extends UserDetailsService {
    public Member saveMember(SignUpDTO signUpDTO);

    public boolean validateMemberId(String userId);

    public boolean validateUsername(String userId);

}
