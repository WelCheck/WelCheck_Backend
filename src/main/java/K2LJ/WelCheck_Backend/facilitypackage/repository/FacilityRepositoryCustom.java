package K2LJ.WelCheck_Backend.facilitypackage.repository;

import K2LJ.WelCheck_Backend.facilitypackage.domain.Facility;
import K2LJ.WelCheck_Backend.facilitypackage.request.Search;

import java.util.List;

public interface FacilityRepositoryCustom {
    List<Facility> getListSearch(Search search);
}
