package com.spring.board.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.board.model.dto.MemberDTO;
import com.spring.board.model.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {

	
	@Autowired
	private MemberService service;
	
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@PostMapping("/login")
	public String login(MemberDTO dto,HttpSession session) throws SQLException {
		
		System.out.println("정보" + dto.getUserId() + "/" + dto.getUserPassword());
		MemberDTO loginInfo = service.login(dto.getUserId(),dto.getUserPassword());
		System.out.println("로그인 ");
		
		if(loginInfo != null) {
			session.setAttribute("loginInfo",loginInfo);
			
		}else { 	
			return "/error/loginCheck";
		}
		
		return "index";
		
	}
	
	
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		
		return "index";
	}
	
	
	
	
	
}
