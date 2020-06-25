package com.bit.demo3;
import com.bit.demo3.Banking;
public class Banking02 {
	// 요소 번호의 의미를 알자 ! [0]입금, [1]출금, [2]잔액
	static int ctotal ;
	static int[][] table = new int[10][];
	static int row;
	//토탈값 반환 메서드
	static int getTotal() {
		int rt = 0;
		rt = ctotal;
		return rt;
	}
			
	// 배열의 주소를 반환한다... 반드시 new로 생성된 것이어야 함.
	//입금 메서드 ! 입금금액을 받으면 입금액:출금액:잔액 으로 반환
	static int[] deposit(int arg) {
		//잔액 가저오기
		int total = getTotal();
		total+=arg;
		ctotal = total;
		int[] event = new int[3];
		event[0] = arg;
		event[1] = 0;
		event[2] = total;
		return event;
	}
	
	//출금 메서드
	static int[] withdraw(int arg) {
		//잔액 가저오기
		int total = getTotal();
		total-=arg;
		ctotal = total;
		int[] event = new int[3];
		event[0] = 0;
		event[1] = arg;
		event[2] = total;
		return event;
	}
	
	
	public static void main(String[] args) {
		int[] event = deposit(1000);
		table[row] = event;
		row++;
//		System.out.println(event[0] + ":" + event[1] + ":" + event[2]);
		
		event = withdraw(500);
		table[row] = event;
		row++;
//		System.out.println(event[0] + ":" + event[1] + ":" + event[2]);
		
		for (int i=0; i < row ; i++) {
			int[] a = table[i];
			System.out.println(a[0] + ":" + a[1] + ":" + a[2] );
		}
		
	}

}
