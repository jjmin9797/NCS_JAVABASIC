package com.bit.demo7;

public class Phone {
	private String number;
	//생성자를 여러 개 만들 수 있다. overloading
	// 이름은 같고, 매개변수가 다른 메서드 여러개...
	// 매개변수가 다르다 ! -> 개수, 자료형
	public Phone() {
		number = "010-8652-7993";
		System.out.println(1);
	}
	
	public Phone(String number) {
		this.number = number;
		System.out.println(2);
	}
	
	public void call() {
		System.out.println("전화 걸기"+ number);
	}
	
	public void rcv() {
		System.out.println("전화 받기");
	}
}
