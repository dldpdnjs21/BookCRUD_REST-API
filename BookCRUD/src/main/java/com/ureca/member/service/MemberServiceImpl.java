package com.ureca.member.service;

import java.sql.SQLException;

import org.springframework.stereotype.Service;

import com.ureca.member.dao.MemberDAO;
import com.ureca.member.dto.Member;

@Service
public class MemberServiceImpl implements MemberService {

	MemberDAO memberDAO;

	public MemberServiceImpl(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}

	@Override
	public Member findMember(Member member) throws SQLException {
		return memberDAO.selectLogin(member);
	}

}
