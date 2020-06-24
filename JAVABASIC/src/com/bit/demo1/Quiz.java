package com.bit.demo1;
import java.io.IOException;
import java.util.Scanner;
public class Quiz {

	public static void main(String[] args) throws IOException {
		//키보드 입력 받아서 0~9값만 출력된다...
		int n;
		int m;
		n = System.in.read();
		m = n % 10;
		System.out.println(m);
		
	}

}

// ---과제---
//키보드 입력 받아 영어 단어,숫자 갯수 파악
//숫자인 경우 ->정수 총합 마지막에 출력
// 입력 : 영어 + 숫자 섞어서
// 출력 : 단어,숫자 갯수 출력, 총합 출력
// 단어에 대한 정의, 정수에 대한 정의
// 
