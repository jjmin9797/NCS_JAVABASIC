package com.bit.demo5;

public class Member {
	
	// 데이터를 가지고 있다... 필드명(항목)
	private String name;
	private String email;
	
	// 일을 할 수 있다... method
	// -필드에 대한 입출력
	// -역할, 기능, 업무 등의 절차
	
	public String getName() {
		return name;
	}
	public void setName(String arg) {
		this.name = arg;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String arg) {
		this.email = arg;
	}
	
	
	
}
