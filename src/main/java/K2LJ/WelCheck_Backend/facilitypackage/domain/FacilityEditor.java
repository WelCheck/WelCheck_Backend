package K2LJ.WelCheck_Backend.facilitypackage.domain;

import lombok.Getter;

@Getter
public class FacilityEditor {

    private final String facilityName;
    private final String fcltCd;
    private final String rprsNm;
    private final String homepageAddr;
    private final String fcltMailAddr;
    private final String fcltZipcd;
    private final String fcltAddr;
    private final String fcltDtl_1Addr;
    private final String fcltDtl_2Addr;
    private final String fcltTelNo;
    private final String fcltTelNo2;
    private final String faxNo;
    private final String cfdCICD;
    private final String cprNm;
    private final String cfbNm;

    public FacilityEditor(String facilityName, String fcltCd, String rprsNm, String homepageAddr, String fcltMailAddr, String fcltZipcd, String fcltAddr, String fcltDtl_1Addr, String fcltDtl_2Addr, String fcltTelNo, String fcltTelNo2, String faxNo, String cfdCICD, String cprNm, String cfbNm) {
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

    public static FacilityEditorBuilder builder() {return new FacilityEditorBuilder();}

    public static class FacilityEditorBuilder {
        private String facilityName;
        private String fcltCd;
        private String rprsNm;
        private String homepageAddr;
        private String fcltMailAddr;
        private String fcltZipcd;
        private String fcltAddr;
        private String fcltDtl_1Addr;
        private String fcltDtl_2Addr;
        private String fcltTelNo;
        private String fcltTelNo2;
        private String faxNo;
        private String cfdCICD;
        private String cprNm;
        private String cfbNm;

        FacilityEditorBuilder() {
        }
        public FacilityEditorBuilder fcilityName(String facilityName) {
            if(facilityName == null){
                this.facilityName = facilityName;
            }
            return this;
        }

        public FacilityEditorBuilder fcltCd(String fcltCd) {
            if(fcltCd == null){
                this.fcltCd = fcltCd;
            }
            return this;
        }

        public FacilityEditorBuilder rprsNm(String rprsNm) {
            if(rprsNm == null){
                this.rprsNm = rprsNm;
            }
            return this;
        }

        public FacilityEditorBuilder homepageAddr(String homepageAddr) {
            if(homepageAddr == null){
                this.homepageAddr = homepageAddr;
            }
            return this;
        }

        public FacilityEditorBuilder fcltMailAddr(String fcltMailAddr) {
            if(fcltMailAddr == null){
                this.fcltMailAddr = fcltMailAddr;
            }
            return this;
        }

        public FacilityEditorBuilder fcltZipcd(String fcltZipcd) {
            if(fcltZipcd == null){
                this.fcltZipcd = fcltZipcd;
            }
            return this;
        }

        public FacilityEditorBuilder fcltAddr(String fcltAddr) {
            if(fcltAddr == null){
                this.fcltAddr = fcltAddr;
            }
            return this;
        }

        public FacilityEditorBuilder fcltDtl_1Addr(String fcltDtl_1Addr) {
            if(fcltDtl_1Addr == null){
                this.fcltDtl_1Addr = fcltDtl_1Addr;
            }
            return this;
        }

        public FacilityEditorBuilder fcltDtl_2Addr(String fcltDtl_2Addr) {
            if(fcltDtl_2Addr == null){
                this.fcltDtl_2Addr = fcltDtl_2Addr;
            }
            return this;
        }

        public FacilityEditorBuilder fcltTelNo(String fcltTelNo) {
            if(fcltTelNo == null){
                this.fcltTelNo = fcltTelNo;
            }
            return this;
        }

        public FacilityEditorBuilder fcltTelNo2(String fcltTelNo2) {
            if(fcltTelNo2 == null){
                this.fcltTelNo2 = fcltTelNo2;
            }
            return this;
        }

        public FacilityEditorBuilder faxNo(String faxNo) {
            if(faxNo == null){
                this.faxNo = faxNo;
            }
            return this;
        }

        public FacilityEditorBuilder cfdCICD(String cfdCICD) {
            if(cfdCICD == null){
                this.cfdCICD = cfdCICD;
            }
            return this;
        }

        public FacilityEditorBuilder cprNm(String cprNm) {
            if(cprNm == null){
                this.cprNm = cprNm;
            }
            return this;
        }

        public FacilityEditorBuilder cfbNm(String cfbNm) {
            if(cfbNm == null){
                this.cfbNm = cfbNm;
            }
            return this;
        }

        public FacilityEditor build(){return new FacilityEditor(this.facilityName,this.fcltCd,this.rprsNm,this.homepageAddr,this.fcltMailAddr,this.fcltZipcd,this.fcltAddr,this.fcltDtl_1Addr,this.fcltDtl_2Addr,this.fcltTelNo,this.fcltTelNo2,this.faxNo,this.cfdCICD,this.cprNm,this.cfbNm);}
    }
}
