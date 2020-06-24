package com.bit.demo1;
import java.util.Scanner;
public class ScanInput {

	public static void main(String[] args) {
		/*
		 * 어디에서 ~ 가져온 값을 원하는 자료형으로 변환
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); //입력된 문자값을  int변환
		sc.nextLine(); // 버퍼에 남은 문자를 다 버린다
		String b = sc.nextLine(); // 문자열 그대로 변환
		System.out.println(a);
		System.out.println(b);
	}

}
