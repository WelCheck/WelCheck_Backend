package K2LJ.WelCheck_Backend.facilitypackage.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
@Entity
@Getter@Setter
@RequiredArgsConstructor
public class Facility {

    @Id @GeneratedValue
    @Column(name = "facility_id")
    private Long id;

    @Column(unique = true, nullable = false)
    private String facilityName; //시설명

    @NotEmpty
    private String fcltCd; //시설코드

    private String rprsNm; //대표자 명

    private String homepageAddr; //홈페이지주소

    private String fcltMailAddr; //시설 이메일 주소

    private String fcltZipcd; //시설 우편 번호

    private String fcltAddr; //시설 주소

    private String fcltDtl_1Addr; //시설 상세주소 1

    private String fcltDtl_2Addr; //시설 상세주소 2

    private String fcltTelNo; //시설 전화번호 1

    private String fcltTelNo2; //시설 전화번호 2

    private String faxNo; //팩스번호

    private String cfdCICD; //업종분류 코드

    private String cprNm;  //법인명

    private String cfbNm; //업종명

    @Builder
    public Facility(String facilityName, String fcltCd, String rprsNm, String homepageAddr, String fcltMailAddr, String fcltZipcd, String fcltAddr, String fcltDtl_1Addr, String fcltDtl_2Addr, String fcltTelNo, String fcltTelNo2, String faxNo, String cfdCICD, String cprNm, String cfbNm) {
        this.facilityName = facilityName;
        this.fcltCd = fcltCd;
        this.rprsNm = rprsNm;
        this.homepageAddr = homepageAddr;
        this.fcltMailAddr = fcltMailAddr;
        this.fcltZipcd = fcltZipcd;
        this.fcltAddr = fcltAddr;
        this.fcltDtl_1Addr = fcltDtl_1Addr;
        this.fcltDtl_2Addr = fcltDtl_2Addr;
        this.fcltTelNo = fcltTelNo;
        this.fcltTelNo2 = fcltTelNo2;
        this.faxNo = faxNo;
        this.cfdCICD = cfdCICD;
        this.cprNm = cprNm;
        this.cfbNm = cfbNm;
    }
}
