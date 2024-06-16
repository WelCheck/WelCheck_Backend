package K2LJ.WelCheck_Backend.facilitypackage.request;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class FacilityCreate {
    @Column(unique = true, nullable = false)
    @NotBlank(message = "시설 명을 입력해주세요")
    public final String facilityName; //시설명

    @NotEmpty
    @NotBlank(message = "시설코드을 입력해주세요")
    public final String fcltCd; //시설코드

    @NotBlank(message = "대표자 명을 입력해주세요")
    public final String rprsNm; //대표자 명

    @NotBlank(message = "홈페이지주소 입력해주세요")
    public final String homepageAddr; //홈페이지주소

    @NotBlank(message = "시설 이메일 주소을 입력해주세요")
    public final String fcltMailAddr; //시설 이메일 주소

    @NotBlank(message = "시설 우편 번호을 입력해주세요")
    public final String fcltZipcd; //시설 우편 번호

    @NotBlank(message = "시설 주소을 입력해주세요")
    public final String fcltAddr; //시설 주소

    @NotBlank(message = "시설 상세주소 1을 입력해주세요")
    public final String fcltDtl_1Addr; //시설 상세주소 1

    @NotBlank(message = "시설 상세주소 2을 입력해주세요")
    public final String fcltDtl_2Addr; //시설 상세주소 2

    @NotBlank(message = "시설 전화번호 1을 입력해주세요")
    public final String fcltTelNo; //시설 전화번호 1

    @NotBlank(message = "시설 전화번호 2을 입력해주세요")
    public final String fcltTelNo2; //시설 전화번호 2

    @NotBlank(message = "팩스번호을 입력해주세요")
    public final String faxNo; //팩스번호

    @NotBlank(message = "업종분류 코드을 입력해주세요")
    public final String cfdCICD; //업종분류 코드

    @NotBlank(message = "법인명을 입력해주세요")
    public final String cprNm;  //법인명

    @NotBlank(message = "업종명을 입력해주세요")
    public final String cfbNm; //업종명

    @Builder
    public FacilityCreate(String facilityName, String fcltCd, String rprsNm, String homepageAddr, String fcltMailAddr, String fcltZipcd, String fcltAddr, String fcltDtl_1Addr, String fcltDtl_2Addr, String fcltTelNo, String fcltTelNo2, String faxNo, String cfdCICD, String cprNm, String cfbNm) {
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
