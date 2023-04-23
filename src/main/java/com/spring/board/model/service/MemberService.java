package com.spring.board.model.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.board.model.dao.MemberDao;
import com.spring.board.model.dto.MemberDTO;

@Service
public class MemberService {

	@Autowired
	private MemberDao dao;
	
	
	public MemberDTO login(String id, String password) throws SQLException {
		return dao.longinMember(id, password);
	}
	
}
