package K2LJ.WelCheck_Backend.memberpackage.domain.member;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QDisabledMember is a Querydsl query type for DisabledMember
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QDisabledMember extends EntityPathBase<DisabledMember> {

    private static final long serialVersionUID = 974227208L;

    public static final QDisabledMember disabledMember = new QDisabledMember("disabledMember");

    public final QMember _super = new QMember(this);

    //inherited
    public final StringPath address = _super.address;

    public final StringPath certified = createString("certified");

    public final StringPath disableCategory = createString("disableCategory");

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

    public QDisabledMember(String variable) {
        super(DisabledMember.class, forVariable(variable));
    }

    public QDisabledMember(Path<? extends DisabledMember> path) {
        super(path.getType(), path.getMetadata());
    }

    public QDisabledMember(PathMetadata metadata) {
        super(DisabledMember.class, metadata);
    }

}

