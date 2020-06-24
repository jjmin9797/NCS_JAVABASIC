package com.bit.demo1;

public class Operators {

	public static void main(String[] args) {
		//연산자 !
		// - 연산의 결과가 무엇이냐를 생각
		// - 연산자 1개 이상을 사용한 문장 -> 식
		// - 결과가 논리인 식 -> 조건식
		// - 논리연산 : 가장 필요한 소양, 판단 근거, 이유

		
		//산술 연산자
		//산수로만 사용
		int a = 1234/100;
		int b = 1234%100;
		String str = "";
		str = "산술 연산자 : " + str + a + '/'+ b ;
		System.out.println(str);
		//관계 연산자
		if (a != 0) {
			System.out.println("같당");
		}
		// -> 값 간의 크기를 비교한다.
		// ~사이
		//논리 연산자
		// -> 논리 간의 비교, 조건식이 여러 개가 있다
		// AND-&& OR-|| NOT-!
		// NOT 단항 - 반대로 만든다.
		if (a != 0 && a > 0) {
			System.out.println("둘다당");
		}
		
		/*
		 * A     B   ㅣ->  AND  OR   
		 * T     T   ㅣ->   T    T
		 * F     F   ㅣ->   F    F
		 * T     F   ㅣ->   F    T
		 * F     T   ㅣ->   F    T
		 * AND -> 둘다 참일 때  OR -> 둘 중 하나라도 참이면 참
		 */
		
		
	}

}
