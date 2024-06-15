package K2LJ.WelCheck_Backend.facilitypackage.repository;


import K2LJ.WelCheck_Backend.facilitypackage.domain.Facility;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FacilityRepository extends JpaRepository<Facility, Long> ,FacilityRepositoryCustom{
    List<Facility> findByFacilityName(String facilityName);
}
