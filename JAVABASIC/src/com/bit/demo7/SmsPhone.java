package com.bit.demo7;

public class SmsPhone extends Phone{
	public SmsPhone() {
		//부모의 생성자도 함께 호출이 된다.
		
		System.out.println(3);
	}
	
	public SmsPhone(String number) {
		System.out.println(4);
	}
	
	public void send() {
		System.out.println("SMS SEND!");
	}
	public void read() {
		System.out.println("SMS READ!");
	}
}
