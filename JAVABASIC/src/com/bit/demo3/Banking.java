package com.bit.demo3;

import java.util.Random;
import java.util.Scanner;

public class Banking {
	// �Ա� ó�� �޼���
	// �ʿ� data -? �ݾ� , ����
	static int total = 100000; // �ܾ�
	static int[] inMoney = new int[40]; //�Աݾ� !
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
		//�Աݾ� -> arg
		//�� �ܾ� + �Աݾ� = �� �ܾ�
		//�� �ܾ� ���� -> ���ϰ�
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
		
		
		//��ݾ�
		//�� �ܾ� - ��ݾ� = �� �ܾ�  -> ���� ���ɼ�
		//�� �ܾ� ���� -> ���ϰ�
	}	
	
	static void history() {
		for(int i=0; i<inMoney.length ; i++) {
			System.out.println(
		"["+i+"]" +
		"("+inMoney[i] + ")" +
		"("+outMoney[i]+")" + "{" + total + "}"		);
		}
	}
	
	
	//���� �޼���
	public static void main(String[] args) {
		Random ran = new Random(); // Ű���� �Է� ���
		int MAX = 10000; // �ִ�ݾ�
		int money;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("---------1.�Ա�  2.��� 3.����ݳ���---------");
			int key ;
			key = sc.nextInt(); sc.nextLine();
			
			
			
			
			
			if(key == 1) {
				money = ran.nextInt(MAX);		
				 deposit(money); //�Ա�
			}
			if(key == 2) {
				money = ran.nextInt(MAX);
				 withdraw(money);//���
			}
			if(key == 3) {
				history();
			}
			System.out.println("�ܾ� : " + total);
		}//end while
		


		
		

	}//Main��

}
