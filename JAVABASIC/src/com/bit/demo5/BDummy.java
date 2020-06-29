package com.bit.demo5;

public class BDummy {
	//  멤버들의 접근자 : private(필드), public(메서드)
	// 클래스는 멤버들을 가지고 있다!
	private int value=3;
	
	public int getValue() {
		return value;
	}
	
	public void setValue1(int value) {
		this.value = value;
	}
	//setter의 경우 현재 객체를반환할때가 있다.
	public BDummy setValue2(int value) {
		//int temp ; // 지역변수
		this.value = value;
		return this;
	}
}
