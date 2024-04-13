package K2LJ.WelCheck_Backend.memberpackage.controller.requestdto;

import K2LJ.WelCheck_Backend.memberpackage.domain.MemberRole;
import K2LJ.WelCheck_Backend.memberpackage.domain.Sex;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class SignUpDTO {
    @NotBlank
    String userId;
    @NotBlank
    String password;
    @NotBlank
    String name;
    @NotBlank
    String username;

    //주소
    @NotBlank
    String zipCode;
    @NotBlank
    String roadName;
    @NotBlank
    String streetNumber;
    @NotBlank
    String detail;
    String reference;
    String phoneNumber;

    Sex sex;
    String email;
    MemberRole role;    //if(role == null) role = GeneralMember

    //DisabledMember
    String certified;
    String disableCategory;

    //WelfareWorkerMember
    String workCertifed;
    String workSpace;

    //GeneralMember
}
