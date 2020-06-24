package com.bit.demo2;

public class Loop {

	public static void main(String[] args) {
		//변수 지역성 : 변수 선언 위치 { }
		/*int n;
		{
			int lo ;
			lo = 20 ;
			n = lo;
		}
		System.out.println(n); // n 은 lo의 영향을 받는다.*/
		//~에서부터 ~까지 ~씩 변한다.
		// 몇 번 실행하냐?
		for(int a = 0; a < 100; a++) {
			//한번 실행
			for (int c = 0; c < 10 ; c += 1) {
				System.out.println(a + c);
			}
		}
	}

}
