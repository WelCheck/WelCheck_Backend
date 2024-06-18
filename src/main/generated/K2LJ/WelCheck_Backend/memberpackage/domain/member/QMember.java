package K2LJ.WelCheck_Backend.memberpackage.domain.member;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QMember is a Querydsl query type for Member
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMember extends EntityPathBase<Member> {

    private static final long serialVersionUID = 1321607020L;

    public static final QMember member = new QMember("member1");

    public final StringPath address = createString("address");

    public final StringPath email = createString("email");

    public final EnumPath<K2LJ.WelCheck_Backend.memberpackage.domain.Gender> gender = createEnum("gender", K2LJ.WelCheck_Backend.memberpackage.domain.Gender.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final EnumPath<K2LJ.WelCheck_Backend.memberpackage.domain.MemberRole> memberRole = createEnum("memberRole", K2LJ.WelCheck_Backend.memberpackage.domain.MemberRole.class);

    public final StringPath name = createString("name");

    public final StringPath password = createString("password");

    public final StringPath userId = createString("userId");

    public final StringPath username = createString("username");

    public QMember(String variable) {
        super(Member.class, forVariable(variable));
    }

    public QMember(Path<? extends Member> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMember(PathMetadata metadata) {
        super(Member.class, metadata);
    }

}

