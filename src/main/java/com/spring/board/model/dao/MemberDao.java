package com.spring.board.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.board.model.dto.MemberDTO;



@Repository
public class MemberDao {

	@Autowired
	private DBUtil util;
	
	
	public MemberDTO longinMember(String id, String password) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		ResultSet rs = null;
		MemberDTO result = null;
		try {
			sql = "select user_id, user_name from members where user_id = ? and user_password=?";
			conn = util.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, id);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				result = new MemberDTO();
				result.setUserId(rs.getString(1));
				result.setUserName(rs.getString(2));
			}
			
		} finally {
			util.close(conn, pstmt, rs);
		}
		
		
		return result;
	}
		
	
	
}
