package com.bit.demo1;
import java.io.IOException;
import java.util.Scanner;
public class KeyInput {

	public static void main(String[] args) throws IOException {
		//키보드 : byte stream 장치
		// 1. 자료형의 일치
		// 2. 오입력, 잘못된 입력 처리
		// - 문자 입력 장치 : 실제로는 정수 (문자 코드로 정해진 값)
		// 입력 : 외부에서 우리에게 어떤 데이터가 들어오는 것을 의미한다.
		int k = System.in.read();
		System.out.println(k); // 문자의 값
		int d = System.in.read();
		System.out.println(d);
		int o = System.in.read();
		System.out.println(o);
	}

}
