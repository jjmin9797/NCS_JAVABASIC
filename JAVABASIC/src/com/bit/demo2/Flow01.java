package com.bit.demo2;

public class Flow01 {

	public static void main(String[] args) {
		//1에서 25까지 출력
		/*for (int a = 1; a <=5; a++) {
			for (int b = 1; b<=5; b++) {
				System.out.print(a+b+ " ");
				
			}
		}*/
		/*
		int count = 0; // 행이 시작될 때 0
		for(int i = 1; i <=25; i++) {
			System.out.print(i+",");
			++count;
			if (count == 5) {
				System.out.println();
				count = 0;
			}
				
		}
		*/
		//차원 구조 : 2차 - 행,열(y,x)
		// 행 : 5, 각 행마다 열 : 5
		
		//보통 밖 = 행 , 
		//안 = 열
		
		int v = 1 ;
		for(int row = 0;row<6;row++) { //행
			for (int col=0;col<5;col++) {//열
				if (v <= 25) {
					System.out.print(v+",");
					++v;
				}
			}
			System.out.println();
		}
		
	}

}
