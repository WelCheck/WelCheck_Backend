package K2LJ.WelCheck_Backend.memberpackage.service;

import K2LJ.WelCheck_Backend.memberpackage.controller.requestdto.SignUpDTO;
import K2LJ.WelCheck_Backend.memberpackage.domain.member.Member;

public interface MemberService {
    public Member saveMember(SignUpDTO signUpDTO);

    public boolean validateMemberId(String userId);

}
