package com.ureca.member.dao;

import java.sql.SQLException;

import org.apache.ibatis.annotations.Mapper;

import com.ureca.member.dto.Member;

@Mapper
public interface MemberDAO {
    public Member selectLogin(Member member)throws SQLException;
}
