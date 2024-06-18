package K2LJ.WelCheck_Backend.facilitypackage.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QFacility is a Querydsl query type for Facility
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QFacility extends EntityPathBase<Facility> {

    private static final long serialVersionUID = -420627332L;

    public static final QFacility facility = new QFacility("facility");

    public final StringPath cfbNm = createString("cfbNm");

    public final StringPath cfdCICD = createString("cfdCICD");

    public final StringPath cprNm = createString("cprNm");

    public final StringPath facilityName = createString("facilityName");

    public final StringPath faxNo = createString("faxNo");

    public final StringPath fcltAddr = createString("fcltAddr");

    public final StringPath fcltCd = createString("fcltCd");

    public final StringPath fcltDtl_1Addr = createString("fcltDtl_1Addr");

    public final StringPath fcltDtl_2Addr = createString("fcltDtl_2Addr");

    public final StringPath fcltMailAddr = createString("fcltMailAddr");

    public final StringPath fcltTelNo = createString("fcltTelNo");

    public final StringPath fcltTelNo2 = createString("fcltTelNo2");

    public final StringPath fcltZipcd = createString("fcltZipcd");

    public final StringPath homepageAddr = createString("homepageAddr");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath rprsNm = createString("rprsNm");

    public QFacility(String variable) {
        super(Facility.class, forVariable(variable));
    }

    public QFacility(Path<? extends Facility> path) {
        super(path.getType(), path.getMetadata());
    }

    public QFacility(PathMetadata metadata) {
        super(Facility.class, metadata);
    }

}

