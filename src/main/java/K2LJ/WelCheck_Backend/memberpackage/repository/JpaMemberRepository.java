package K2LJ.WelCheck_Backend.memberpackage.repository;

import K2LJ.WelCheck_Backend.memberpackage.domain.member.Member;

import java.util.List;

//SpringDataJPA 미사용
//@Repository
public interface JpaMemberRepository {
    public void save(Member member);

    public Member findOne(Long id);

    public List<Member> findAll();
}
