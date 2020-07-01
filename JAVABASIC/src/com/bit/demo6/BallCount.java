package com.bit.demo6;
import java.util.Scanner;
public class BallCount {
	
	
	static int[] count(int a, int b) {
		
		char[] taja1 = new char[3];
		char[] taja2 = new char[3];
		int[] cc = new int[2];
		int aa = 0;
		int bb = 0;				
		int com = 100;
		
		for (int i=0; i <3 ; i++) {
			taja1[i] = (char)(a/com);
			taja2[i] = (char)(b/com);
			a = a - ((int)(taja1[i]) * com) ;
			b = b - ((int)(taja2[i]) * com) ;
			com = com/10;
		}		
		
		for (int x = 0; x <3; x++) {
			for(int y = 0; y<3;y++) {
				if (taja1[y] == taja2[x]) {
					if(x==y) {
						aa = aa + 1;
					}else {
						bb = bb + 1;
					}										
				}
			}
		}		
		cc[0] = aa;
		cc[1] = bb;		
		return cc;
		
		// 1. a와 b를 char[] 배열로 변환
		// 2. 배열의 특징은 위치와 값의 표현이 가능하다!
		// 두 배열을 비교해서 
		// 값이 같으면서 위치가 같으면 [0]++
		// 값이 같으면서 위치가 다르면 [1]++
		// 종료시 배열을 반환하고 종료
		

	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int[] ballcount = count(num1,num2);
		System.out.println("Strike : " + ballcount[0]);
		System.out.println("Ball : " + ballcount[1]);

	}

}
