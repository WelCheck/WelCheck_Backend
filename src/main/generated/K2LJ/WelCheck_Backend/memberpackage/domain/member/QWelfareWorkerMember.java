package K2LJ.WelCheck_Backend.memberpackage.domain.member;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QWelfareWorkerMember is a Querydsl query type for WelfareWorkerMember
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QWelfareWorkerMember extends EntityPathBase<WelfareWorkerMember> {

    private static final long serialVersionUID = 2044373714L;

    public static final QWelfareWorkerMember welfareWorkerMember = new QWelfareWorkerMember("welfareWorkerMember");

    public final QMember _super = new QMember(this);

    //inherited
    public final StringPath address = _super.address;

    //inherited
    public final StringPath email = _super.email;

    //inherited
    public final EnumPath<K2LJ.WelCheck_Backend.memberpackage.domain.Gender> gender = _super.gender;

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final EnumPath<K2LJ.WelCheck_Backend.memberpackage.domain.MemberRole> memberRole = _super.memberRole;

    //inherited
    public final StringPath name = _super.name;

    //inherited
    public final StringPath password = _super.password;

    //inherited
    public final StringPath userId = _super.userId;

    //inherited
    public final StringPath username = _super.username;

    public final StringPath workCertifed = createString("workCertifed");

    public final StringPath workSpace = createString("workSpace");

    public QWelfareWorkerMember(String variable) {
        super(WelfareWorkerMember.class, forVariable(variable));
    }

    public QWelfareWorkerMember(Path<? extends WelfareWorkerMember> path) {
        super(path.getType(), path.getMetadata());
    }

    public QWelfareWorkerMember(PathMetadata metadata) {
        super(WelfareWorkerMember.class, metadata);
    }

}

