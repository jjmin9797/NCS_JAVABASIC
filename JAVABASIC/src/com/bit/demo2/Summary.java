package com.bit.demo2;

public class Summary {
	public void todo() {
		System.out.println("Hello World!");
	}
	public static void main(String[] args) {
		//static 정적 -> 이미 만들어 놨다 !
		//static이 붙어있는 메서드는  static 만 사용할 수 있다.
		//만약 사용하고 싶다면 인스턴스를 생성후 사용 가능하다.
		// class 생성 후 !
		Summary sm = new Summary();
		sm.todo();
		
	}
	
}
