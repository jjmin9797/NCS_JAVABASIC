package com.bit.demo2;

public class Statement {

	public static void main(String[] args) {
		char c = 'b';
		
		switch(c) { //상수식
		case 'a' : // 필수 : 비교할 값을 1개만
			System.out.println(1);
			break;
		case 'b' : //변수명은 한개, 거미줄처럼 하지 못함
			System.out.println(2);
		default :
			System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		}

	}

}
