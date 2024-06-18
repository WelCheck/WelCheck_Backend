package K2LJ.WelCheck_Backend.memberpackage.domain.member;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QGeneralMember is a Querydsl query type for GeneralMember
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QGeneralMember extends EntityPathBase<GeneralMember> {

    private static final long serialVersionUID = 342158480L;

    public static final QGeneralMember generalMember = new QGeneralMember("generalMember");

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

    public QGeneralMember(String variable) {
        super(GeneralMember.class, forVariable(variable));
    }

    public QGeneralMember(Path<? extends GeneralMember> path) {
        super(path.getType(), path.getMetadata());
    }

    public QGeneralMember(PathMetadata metadata) {
        super(GeneralMember.class, metadata);
    }

}

