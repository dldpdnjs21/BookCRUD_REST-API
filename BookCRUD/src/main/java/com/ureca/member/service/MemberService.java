package com.ureca.member.service;

import java.sql.SQLException;
import com.ureca.member.dto.Member;


public interface MemberService {

	//멤버 존재유무(로그인에 사용)
    public Member findMember(Member member)throws SQLException;
}
