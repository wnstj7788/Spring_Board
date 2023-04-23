package com.spring.board.model.dto;


public class MemberDTO {
	private String userId; //user_id
	private String userPassword; //user_pw
	private String userName; //user_name
	
	
	public MemberDTO() {}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getUserPassword() {
		return userPassword;
	}


	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	@Override
	public String toString() {
		return "MemberDTO [userId=" + userId + ", userPassword=" + userPassword + ", userName=" + userName + "]";
	}; // DTO 기본 생성자 꼭 만들기!! (라이브러리들이 객체 대신 만들어줄 때 씀 )
	
	

}
