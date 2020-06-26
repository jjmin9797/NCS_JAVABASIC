package com.bit.demo4;

public class FlowArray {

	public static void main(String[] args) {
		int[][] a2 ;
		// [행][열] 2차구조, 표 (table)
		// 열 번호 : 의미 용도 파악 !! 중요 !!  1.국어 2.영어 3.수하
		a2 = new int[5][3];
		int count = 1;
		//2차 배열 : 2중 for문
		for(int i = 0;i < 5 ; i ++) {
			for(int x = 0;x < 3; x++) {
				a2[i][x] = count;
				count ++;
				System.out.print(a2[i][x]+ " ");
			}
			System.out.println();
		}

		for (int c = 0; c < 5; c++) {
			for (int cc : a2[c]) {
				System.out.print(cc + " ");
			}
			System.out.println();
		}
	}
		
	
	
	public static void foreach(String[] args) {
		//배열 다루기!
		int count = 0;
		int[] a1 = new int[5] ;
//		System.out.println(a1[0]);
		//for-each : 요소단위
		for (int e : a1) {
			if (e==0) {
				count ++;
				
			}
		
		}
//		System.out.println(count);
		
		
		for(int i= 0; i < a1.length; i++) {
			//a1[i] = i+10;
			//System.out.println(a1[i]);
		}
		
	}

}
