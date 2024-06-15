package K2LJ.WelCheck_Backend.facilitypackage.repository;

import K2LJ.WelCheck_Backend.facilitypackage.domain.Facility;
import K2LJ.WelCheck_Backend.facilitypackage.request.Search;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.List;

import static K2LJ.WelCheck_Backend.facilitypackage.domain.QFacility.facility;

@RequiredArgsConstructor
public class FacilityRepositoryImpl implements FacilityRepositoryCustom{
    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public List<Facility> getListSearch(Search search) {
        return jpaQueryFactory.selectFrom(facility)
                .limit(search.getSize())
                .offset(search.getOffset())
                .orderBy(facility.id.desc())
                .fetch();
    }
}
