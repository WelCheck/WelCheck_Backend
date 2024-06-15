package K2LJ.WelCheck_Backend.memberpackage.domain.member;

import K2LJ.WelCheck_Backend.facilitypackage.domain.Facility;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@NoArgsConstructor
@SuperBuilder
public class WelfareWorkerMember extends Member{
    //변경필요
    private String workCertifed;    //재직증명서(또는 인증여부)

    private String workSpace;
/*
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "facility_id")
    private Facility workSpace; //근무지
*/

}
