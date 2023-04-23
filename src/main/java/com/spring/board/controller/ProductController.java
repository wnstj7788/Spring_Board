package com.spring.board.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

import java.sql.SQLException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.board.model.dto.MemberDTO;
import com.spring.board.model.dto.ProductDTO;
import com.spring.board.model.service.ProductService;



@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@GetMapping("list")
	public ModelAndView list() throws SQLException {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/board/list");
		mv.addObject("products", service.list());
		return mv;
	}
	
	@GetMapping("/write")
	public String write(HttpSession session) {
		MemberDTO loginInfo = (MemberDTO) session.getAttribute("loginInfo");

		if (loginInfo == null) {
			return "/error/writeCheck"; // 로그인하라는 alert 띄우고 싶음, 근데 그건 html에 자바스크립트야
		} else {
			return "/board/write";
		}
//		return "write"; // 로그인 된 애는 글쓰기 화면을 보여주면 된다.

	}
	
	
	
	@PostMapping("/write")
	public String write(ProductDTO product) throws SQLException {
		service.write(product);
		return "redirect:list";
	}

}
