package K2LJ.WelCheck_Backend.facilitypackage.service;

import K2LJ.WelCheck_Backend.facilitypackage.domain.Facility;
import K2LJ.WelCheck_Backend.facilitypackage.exception.FacilityNotFound;
import K2LJ.WelCheck_Backend.facilitypackage.repository.FacilityRepository;
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
}
