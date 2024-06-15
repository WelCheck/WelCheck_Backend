package K2LJ.WelCheck_Backend.facilitypackage.repository;

import K2LJ.WelCheck_Backend.facilitypackage.domain.Facility;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FacilityRepositoryTest {
        private FacilityRepository facilityRepository;

        @BeforeEach
        void setUp() {
                facilityRepository.deleteAll();
        }

        @Test
        @DisplayName("시설 저장")
        public void save() throws Exception{
            Facility facility = Facility.builder()
                    .facilityName("facilityName1")
                    .fcltCd("000001")
                    .rprsNm("대표명")
                    .homepageAddr("www.aaa.com")
                    .fcltMailAddr("aaa@aaa.com")
                    .fcltZipcd("0001")
                    .fcltAddr("부산시")
                    .fcltDtl_1Addr("남산로 988-8")
                    .fcltDtl_2Addr("2층")
                    .fcltTelNo("051-333-3333")
                    .build();

            facilityRepository.save(facility);

            Facility facility1 = facilityRepository.findById(facility.getId()).get();

            assertEquals(facility.getFacilityName(), facility1.getFacilityName());
        }
}