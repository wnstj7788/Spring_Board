package com.spring.board.model.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.board.model.dao.ProductDao;
import com.spring.board.model.dto.ProductDTO;

@Service
public class ProductService {
	@Autowired
	private ProductDao dao;
	
	
	public int write(ProductDTO product) throws SQLException {
		return dao.insert(product);
		
	}
	
	
//	public ProductDTO read(int bno) throws SQLException {
//		return dao.selectOne(bno);
//	}
//	
	
//	public int remove(int bno) throws SQLException {
//		return dao.delete(bno);
//	}
	
	public List<ProductDTO> list() throws SQLException {
		return dao.selectAll();
	}
	
}
