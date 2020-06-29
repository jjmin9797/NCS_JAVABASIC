package com.bit.demo5;

public class DiveJava {
	//Java Object Oriented Programming
	//객체 : 실제 메모리에 있다 ... (instance)
	//클래스 : 1) 자료형-복합형  2) 객체의 원형(틀)
	// -변수와 함수들의 모음!
	// 1. 소스파일 : source file
	//		{ 클래스 명 }.java
	// 		첫 글자 대문자(영문) 특수문자, 기호 사용불가
	// 2. 파일명 (클래스명)과 같은 class 정의하기
	// 3. member들을 작성(선언, 정의, 구현)
	// 4. new 명령어를 사용하여 (인스턴스)를 생성!
	// 5. 인스턴스에 변수, 함수들을 사용해서 처리
	// member :변수 : field
	// 접근자 자료형 변수명;
	// Java Bean : 필드와 그 필드에 대한 입출력 메서드
	// 				-> 자료형 관점, 프레임워크
	
	
	
	// member : 함수 : method
	// 접근자 반환형 메서드명(매개변수...) {
	//     실행내용
	//     독립성을 유지..?
	
	int number; // 인스턴스 변수 : 모든 인스턴스들이 가지고 있지만 독립적이다.
	// get; set; 필요
	static int serial; // 클래스 변수 : 모두 같은 값을 가진다.
	// 클래스명.serial = 100 ; <- 접근 가능
	int getNumber () { // getter <- 필드를 반환(출력)하는 함수 
		return number;
	}
	
	void setMember(int arg) { //setter <- 
		number = arg; 
	}
	
	public static void main(String[] args) {
		

	}

}
