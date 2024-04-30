package K2LJ.WelCheck_Backend.memberpackage.service;

import K2LJ.WelCheck_Backend.memberpackage.controller.requestdto.SignUpDTO;
import K2LJ.WelCheck_Backend.memberpackage.domain.Address;
import K2LJ.WelCheck_Backend.memberpackage.domain.MemberRole;
import K2LJ.WelCheck_Backend.memberpackage.domain.member.DisabledMember;
import K2LJ.WelCheck_Backend.memberpackage.domain.member.GeneralMember;
import K2LJ.WelCheck_Backend.memberpackage.domain.member.Member;
import K2LJ.WelCheck_Backend.memberpackage.domain.member.WelfareWorkerMember;
import K2LJ.WelCheck_Backend.memberpackage.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberServiceImp implements MemberService {

    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    private final MemberRepository memberRepository;

    @Override
    public Member saveMember(SignUpDTO signUpDTO) {
        //Member Type 확인
        MemberRole memberRole;
        if (signUpDTO.getMemberRole() == null) {
            memberRole = MemberRole.GeneralMember;
        }
        memberRole = signUpDTO.getMemberRole(); // role & sex DTO에 변수타입 convert제대로 되어 넘어오는지 확인

        Member newMember;
        if (memberRole == MemberRole.DisabledMember) {
            newMember = getDisabledMember(signUpDTO);
        } else if (memberRole == MemberRole.WelfareWorkerMember) {
            newMember = getWelfareWorkerMember(signUpDTO);
        }else{
            newMember = getGeneralMember(signUpDTO);
        }

        return memberRepository.save(newMember);
    }

    @Override
    public boolean validateMemberId(String userId) {
        //findAll()을 돌면서 각 userId와 비교
        List<Member> allMembers = memberRepository.findAll();
        for (Member m : allMembers) {
            if (userId.equals(m.getUserId())) {
                return true;    //중복 o
            }
        }
        return false;   //중복 x
    }

    @Override
    public boolean validateUsername(String username) {
        //findAll()을 돌면서 각 userId와 비교
        List<Member> allMembers = memberRepository.findAll();
        for (Member m : allMembers) {
            if (username.equals(m.getUsername())) {
                return true;    //중복 o
            }
        }
        return false;   //중복 x
    }

    private DisabledMember getDisabledMember(SignUpDTO signUpDTO) {
        String encodedPassword = encodingPassword(signUpDTO.getPassword());
        Address madeAddress = makeAddress(signUpDTO);

        return DisabledMember.builder()
                .userId(signUpDTO.getUserId())
                .password(encodedPassword)
                .name(signUpDTO.getName())
                .username(signUpDTO.getUsername())
                .address(madeAddress)
                .sex(signUpDTO.getSex())
                .email(signUpDTO.getEmail())
                .memberRole(MemberRole.DisabledMember)
                .certified(signUpDTO.getCertified())
                .disableCategory(signUpDTO.getDisableCategory())
                .build();
    }

    private WelfareWorkerMember getWelfareWorkerMember(SignUpDTO signUpDTO) {
        String encodedPassword = encodingPassword(signUpDTO.getPassword());
        Address madeAddress = makeAddress(signUpDTO);

        return WelfareWorkerMember.builder()
                .userId(signUpDTO.getUserId())
                .password(encodedPassword)
                .name(signUpDTO.getName())
                .username(signUpDTO.getUsername())
                .address(madeAddress)
                .sex(signUpDTO.getSex())
                .email(signUpDTO.getEmail())
                .memberRole(MemberRole.WelfareWorkerMember)
                .workCertifed(signUpDTO.getWorkCertifed())
                .workSpace(signUpDTO.getWorkSpace())
                .build();
    }

    private GeneralMember getGeneralMember(SignUpDTO signUpDTO) {
        {
            String encodedPassword = encodingPassword(signUpDTO.getPassword());
            Address madeAddress = makeAddress(signUpDTO);

            return GeneralMember.builder()
                    .userId(signUpDTO.getUserId())
                    .password(encodedPassword)
                    .name(signUpDTO.getName())
                    .username(signUpDTO.getUsername())
                    .address(madeAddress)
                    .sex(signUpDTO.getSex())
                    .email(signUpDTO.getEmail())
                    .memberRole(MemberRole.GeneralMember)
                    .build();
        }
    }

    private String encodingPassword(String password) {
        return bCryptPasswordEncoder.encode(password);
    }

    private Address makeAddress(SignUpDTO signUpDTO) {
        return Address.builder()
                .zipCode(signUpDTO.getZipCode())
                .roadName(signUpDTO.getRoadName())
                .streetNumber(signUpDTO.getStreetNumber())
                .detail(signUpDTO.getDetail())
                .reference(signUpDTO.getReference())
                .phoneNumber(signUpDTO.getPhoneNumber())
                .build();
    }

    //---------------------------------------------------------------회원가입
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Member findMember = memberRepository.findByUserId(username);

        if (findMember == null) {
            //로그인 시도시, userId가 존재하지 않으면
            return null;
        }
        //로그인 시도시, userId가 존재하면 UserDetails객체를 만들어 반환
        //반환한 UserDetails객체로 로그인을 검증해줌
        return new MemberDetailsDTO(findMember);
    }

    //----------------------------------------------------------------로그인
}
