package com.bit.demo3;

public class ExArray04 {

	public static void main(String[] args) {
		//stack
		
		int[] score = new int[10];
		int sp = 0;
		
		// 추가하기를 할 때는 [sp]번에 저장 ! sp++
		for (int i=0; i<3; i++) {
			score[sp] = 1;
			++sp;
		}
		// 저장된 값 꺼내기 sp-- 그리고 [sp]를 꺼낸다.
		for (int i=0; i<3; i++) {
			--sp;
			System.out.println(score[sp]);
			
		
		}
		
		System.out.println(sp);
	}

}
