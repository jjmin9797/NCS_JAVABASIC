package com.bit.demo8;
// 인터페이스 : 클래스가 아닙니다 ! 아뉩니다. 그렇지 않습니다.
// - 접점 : API (Application Programming Interface)
// - 추상메서드만 작성 가능 -> 구현하면 안된다 추성메서드로만 구성되어야 한다
// - filed : 상수만 작성 가능(final)
// - 역할 : 선수 , 감독 , 관리자 , 사용자 
// - 프레임워크(spring) : 인터페이스 기준으로 구현 !

// 설계 - 기획
// 인터페이스 -> 추상 클래스 -> 구현 클래스 ->

interface Workable {
	// 설계한다는 개념을 가지자 !
	// interface 안에는 final 필드만 사용할 수 있다
	// 웬만하면 final을 써놓자
	final int a = 3;
	final String b = "3";
	
	public abstract void todo() ;
	public abstract void something();
	
}
class WorkImpl implements Workable{

	@Override
	public void todo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void something() {
		// TODO Auto-generated method stub
		
	}
	
}

public class DemoInterface {
	
	static void process(Workable param){
		param.todo();
		param.something();
	}
	
	public static void main(String[] args) {
		process(new WorkImpl() /*Workface 의 구현체 !를 넣어주어야 한당 ㅎㅎ*/);

	}

}
