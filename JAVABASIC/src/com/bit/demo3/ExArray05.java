package com.bit.demo3;

public class ExArray05 {

	public static void main(String[] args) {
		//빈 자리를 찾아라 !...
		//비었다 : 0 ~ 100
		int[] score = new int[20] ;
		int EMPTY = 999;
		for (int i=0; i<score.length; i++) {
			System.out.println(score[i]);
			score[i] = EMPTY; // 빈자리를 의미함			
		}
		//빈 요소의 번호를 검색하시오 !
		int empty_index= EMPTY ;
		for (int i=0; i<score.length; i++) {
			if(score[i] == EMPTY) {
				empty_index = i;
				//하나를 찾는 경우
				break; //첫번째에서 멈춘다 안쓰면 마지막 것을 찾는다
			}
		}
		//없으면 !
		if (empty_index != EMPTY) {
			System.out.println(empty_index);
		}else {
			System.out.println
			("Nob!");
		}
		
	}

}
