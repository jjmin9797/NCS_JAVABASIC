package com.bit.demo3;

import java.util.Random;
import java.util.Scanner;

public class Banking {
	// 입금 처리 메서드
	// 필요 data -? 금액 , 누가
	static int total = 100000; // 잔액
	static int[] inMoney = new int[40]; //입금액 !
	static int[] outMoney = new int[40];
	static int[] totalHistory = new int[40];
	static int inIdx = 0;
	static int outIdx = 0;
	static int hisIdx = 0;
	
	static int deposit(int arg) { // arg = money
		total = total + arg;		
		inMoney[inIdx] = arg;		
		inIdx++;
		outIdx++;
		return total;
		//입금액 -> arg
		//현 잔액 + 입금액 = 현 잔액
		//총 잔액 저장 -> 리턴값
	}
	
	static int withdraw(int arg) {
		if(arg <= total) {
			total = total - arg;
			outMoney[outIdx] = arg;
			outIdx++;
			inIdx++;
			return total;
		}else {
			return total;
		}
		
		
		//출금액
		//현 잔액 - 출금액 = 현 잔액  -> 음수 가능성
		//총 잔액 저장 -> 리턴값
	}	
	
	static void history() {
		for(int i=0; i<inMoney.length ; i++) {
			System.out.println(
		"["+i+"]" +
		"("+inMoney[i] + ")" +
		"("+outMoney[i]+")" + "{" + total + "}"		);
		}
	}
	
	
	//메인 메서등
	public static void main(String[] args) {
		Random ran = new Random(); // 키보드 입력 대신
		int MAX = 10000; // 최대금액
		int money;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("---------1.입금  2.출금 3.입출금내역---------");
			int key ;
			key = sc.nextInt(); sc.nextLine();
			
			
			
			
			
			if(key == 1) {
				money = ran.nextInt(MAX);		
				 deposit(money); //입금
			}
			if(key == 2) {
				money = ran.nextInt(MAX);
				 withdraw(money);//출금
			}
			if(key == 3) {
				history();
			}
			System.out.println("잔액 : " + total);
		}//end while
		


		
		

	}//Main끝

}
