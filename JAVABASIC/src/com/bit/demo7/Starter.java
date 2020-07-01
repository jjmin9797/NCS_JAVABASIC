package com.bit.demo7;

public class Starter {
	
	/*
	 * 야구 게임 구현
	 * - 상속, 추상, 인터페이스 OOP문법
	 * 
	 */
	
	public static void main(String[] args) {
		BaseBall game = new BaseBall(); //기본 생성자
		game.start();
		//moreInher();
	}

	
	
	/*
	 * 상속
	 * 1. 코드 재사용
	 * 2. 클래스 만들 때 클라스 간의 관계 : 부모-자식 관계
	 * 3. 단일 상속만 가능
	 * 4. 자식 클래스 extends 부모 크래스
	 * 5. 객체 생성 시 : 부모 클래스형 변수 == new 자식클래스()
	 * 6. 오버라이딩(override) : 부모의 메서드를 대체한다.
	 * - 부모 클래스를 수정하는 일이 없어야 한다.
	 * 7. 형변환 시 new 뒤에 클래스 확인
	 * - (자식클래스)인스턴스명 ; <- 해당 인스턴스가 
	 * - 모든 클래스의 부모되는 Object : 자료형 미정, 명확하지 않은경우
	 */
	
	
	/*
	 * 추상 클래스
	 * - 미완성 !(메스드 중 정의되지 않은 것이 있다. : 추상 메서드)
	 * - 객체를 생성할 수 없다 !
	 * - 완전체 클래스 만든 후 사용해야 한다.
	 * 
	 * 인터페이스 (클래스 아님!!)
	 * - 추상 메서드만 쓸 수 있다.
	 * - 프레임 워크 사용시 반드시 이해가 필요하다
	 * 
	 * 
	 */
	
	
	static void moreInher() {
		Phone myPhone = new Phone();
		myPhone.call();
		myPhone.rcv();
	
		SmsPhone momPhone = new SmsPhone("010-3333-3333");
		momPhone.call();
		momPhone.rcv();
		momPhone.send();
		momPhone.read();
		
		
		Object objPhone = new SmsPhone("010-3333-3333");
		String name = objPhone.getClass().getName();
		System.out.println(name);
	//	objPhone.call();
	//	objPhone.rcv();
//		objPhone.send();
	//	objPhone.read();
	}
	
	
	
}
