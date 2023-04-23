package com.spring.board.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.board.model.dto.ProductDTO;



@Repository
public class ProductDao {
	@Autowired
	private DBUtil util;
	
	
	public int insert(ProductDTO product) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		ResultSet rs = null;
		int result = 0;
		
		try {
			sql = "insert into product (code, model, price)\r\n" + 
					"values(?, ?, ?);";
			conn = util.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, product.getCode());
			pstmt.setString(2, product.getModel());
			pstmt.setInt(3, product.getPrice());

			result = pstmt.executeUpdate();
			
		} finally {
			util.close(conn, pstmt, rs);
		}
		
		return result;
		
		
	}
//	
//	public int delete(int bno) throws SQLException {
//		Connection conn = null;
//		PreparedStatement pstmt = null;
//		String sql = null;
//		ResultSet rs = null;
//		int result = 0;
//		
//		try {
//			sql = "delete from board_tb where bno=?";
//			conn = util.getConnection();
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setInt(1,bno);
//			result = pstmt.executeUpdate();
//			
//		} finally {
//			util.close(rs, pstmt, conn);
//		}
//		
//		return result;
//		
//		
//	
//		
//	}
//	
	public List<ProductDTO> selectAll() throws SQLException{
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		ResultSet rs = null;
		List<ProductDTO> result = new ArrayList<ProductDTO>();
		
		
		try {
			sql = "select code, model, price from product";
			conn = util.getConnection();
			pstmt = conn.prepareStatement(sql);
			
	
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ProductDTO p = new ProductDTO();
				p.setCode(rs.getString(1));
				p.setModel(rs.getString(2));
				p.setPrice(rs.getInt(3));
				result.add(p);
				
			}
			
		} finally {
			util.close(conn, pstmt, rs);
		}
		
		return result;
		
	}
//	
//	public BoardDTO selectOne(int bno) throws SQLException {
//		Connection conn = null;
//		PreparedStatement pstmt = null;
//		String sql = null;
//		ResultSet rs = null;
//		BoardDTO result = null;
//		
//		try {
//			sql = "select bno,bwriter, btitle, bwrite_date, bcontent from board_tb where bno= ?";
//			conn = util.getConnection();
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setInt(1, bno);
//			
//	
//			rs = pstmt.executeQuery();
//			
//			while(rs.next()) {
//				BoardDTO b = new BoardDTO();
//				b.setBno(rs.getInt(1));
//				b.setBwriter(rs.getString(2));
//				b.setBtitle(rs.getString(3));
//				b.setBwriteDate(rs.getString(4));
//				b.setBcontent(rs.getString(5));
//				result = b;
//				
//			}
//			
//			
//		} finally {
//			util.close(conn, pstmt, rs);
//		}
//		
//		return result;
//		
//	}
}
