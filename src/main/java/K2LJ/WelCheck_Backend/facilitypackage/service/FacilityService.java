package K2LJ.WelCheck_Backend.facilitypackage.service;

import K2LJ.WelCheck_Backend.facilitypackage.domain.Facility;
import K2LJ.WelCheck_Backend.facilitypackage.domain.FacilityEditor;
import K2LJ.WelCheck_Backend.facilitypackage.exception.FacilityNotFound;
import K2LJ.WelCheck_Backend.facilitypackage.repository.FacilityRepository;
import K2LJ.WelCheck_Backend.facilitypackage.request.FacilityCreate;
import K2LJ.WelCheck_Backend.facilitypackage.request.FacilityEdit;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FacilityService {
    private final FacilityRepository facilityRepository;

    public List<Facility> findAll(){
       return facilityRepository.findAll();
    }

    public Facility findById(Long id){
        return facilityRepository.findById(id).orElseThrow(FacilityNotFound::new);
    }

    public Facility save(FacilityCreate facilityCreate){
        Facility facility = Facility.builder()
                .facilityName(facilityCreate.getFacilityName())
                .fcltCd(facilityCreate.getFcltCd())
                .rprsNm(facilityCreate.getRprsNm())
                .homepageAddr(facilityCreate.getHomepageAddr())
                .fcltMailAddr(facilityCreate.getFcltMailAddr())
                .fcltZipcd(facilityCreate.getFcltZipcd())
                .fcltAddr(facilityCreate.getFcltAddr())
                .fcltDtl_1Addr(facilityCreate.getFcltDtl_1Addr())
                .fcltDtl_2Addr(facilityCreate.getFcltDtl_2Addr())
                .fcltTelNo(facilityCreate.getFcltTelNo())
                .fcltTelNo2(facilityCreate.getFcltTelNo2())
                .faxNo(facilityCreate.faxNo)
                .cfdCICD(facilityCreate.getCfdCICD())
                .cprNm(facilityCreate.getCprNm())
                .cfbNm(facilityCreate.getCfbNm())
                .build();

        return facilityRepository.save(facility);
    }

    public void edit(Long id, FacilityEdit facilityEdit){
        Facility facility = facilityRepository.findById(id)
                .orElseThrow(FacilityNotFound::new);

        FacilityEditor.FacilityEditorBuilder editorBuilder = facility.toEditor();

        FacilityEditor facilityEditor = editorBuilder.fcilityName(facilityEdit.getFacilityName())
                .fcltCd(facilityEdit.getFcltCd())
                .rprsNm(facilityEdit.getRprsNm())
                .homepageAddr(facilityEdit.getHomepageAddr())
                .fcltMailAddr(facilityEdit.getFcltMailAddr())
                .fcltZipcd(facilityEdit.getFcltZipcd())
                .fcltAddr(facilityEdit.getFcltAddr())
                .fcltDtl_1Addr(facilityEdit.getFcltDtl_1Addr())
                .fcltDtl_2Addr(facilityEdit.getFcltDtl_2Addr())
                .fcltTelNo(facilityEdit.getFcltTelNo())
                .fcltTelNo2(facilityEdit.getFcltTelNo2())
                .faxNo(facilityEdit.faxNo)
                .cfdCICD(facilityEdit.getCfdCICD())
                .cprNm(facilityEdit.getCprNm())
                .cfbNm(facilityEdit.getCfbNm())
                .build();

        facility.edit(facilityEditor);
    }
    public void delete(Long id){
        Facility facility = facilityRepository.findById(id)
                .orElseThrow(FacilityNotFound::new);

        facilityRepository.delete(facility);
    }
}
