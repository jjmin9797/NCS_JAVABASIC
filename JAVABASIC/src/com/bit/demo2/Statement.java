package com.bit.demo2;

public class Statement {

	public static void main(String[] args) {
		char c = 'b';
		
		switch(c) { //�����
		case 'a' : // �ʼ� : ���� ���� 1����
			System.out.println(1);
			break;
		case 'b' : //�������� �Ѱ�, �Ź���ó�� ���� ����
			System.out.println(2);
		default :
			System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		}

	}

}
