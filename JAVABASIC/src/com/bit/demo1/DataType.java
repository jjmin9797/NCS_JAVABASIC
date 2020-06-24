package com.bit.demo1;




public class DataType {

	public static void main(String[] args) {
		//기본 인식 형태
		//저장할 값의 종류 판단, 해당 자료형의 변수를 만든다.
		boolean b1 = true;
		boolean b2 = false;
		char c1 = 'A';
		
		//정수
		int i1 = 10; // 4바이트
		short i2 = 20; // 2바이트
		long i3 = 30 ; // 8바이트 -> DB에서 많이 쓰임
		
		//실수
		float f2 = 1.34F; //4바이트 뒤에 F를 붙여야함. 쓸 일이 없지 않을까?
		double f1 = 12.34;//8바이트
		
		// 여러 개의 변수 값들을 출력하고 싶을 때 -> 문자열 + 연산으로 길게 합칠 수 있다.
		String str = "";
		str = str + i1 + i2 + b1 ;
		String s1 = "A";
		System.out.println(str);
	}

}
