package com.bit.demo3;

public class ExArray03 {

	public static void main(String[] args) {
		int[] score = new int[10]; // score.length
		// 0번에서부터 하나씩 증가, 추가
		int last = 0; // 배열의 요소번호로 사용!
		score[last] = 1; 
		++last;
		score[last] = 2;
		++last;
		System.out.println(last + " 개를 저장 했다. ");
		System.out.println(last-1 + " 번 저장했다");
		if (last < score.length) {
			score[last] = 3;
			++last;
			
		}else {
			System.out.println("Full");
		}
	}

}
