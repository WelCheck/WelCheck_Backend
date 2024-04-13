package K2LJ.WelCheck_Backend.memberpackage.domain.member;

import K2LJ.WelCheck_Backend.memberpackage.domain.Address;
import K2LJ.WelCheck_Backend.memberpackage.domain.MemberRole;
import K2LJ.WelCheck_Backend.memberpackage.domain.Sex;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "MTYPE")
@SuperBuilder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Member {
    @Id @GeneratedValue @Column(name = "member_id")
    private Long id;

    private String userId;  //unique value

    private String password;

    private String name;

    private String username;    //unique value

    @Embedded
    private Address address;  //변경필요 - api사용

    @Enumerated(EnumType.STRING)
    private Sex sex;

    @Email
    private String email;

    @Enumerated(EnumType.STRING)
    private MemberRole memberRole;
}
