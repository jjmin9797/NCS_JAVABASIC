package com.bit.demo2;

public class Flow01 {

	public static void main(String[] args) {
		//1���� 25���� ���
		/*for (int a = 1; a <=5; a++) {
			for (int b = 1; b<=5; b++) {
				System.out.print(a+b+ " ");
				
			}
		}*/
		/*
		int count = 0; // ���� ���۵� �� 0
		for(int i = 1; i <=25; i++) {
			System.out.print(i+",");
			++count;
			if (count == 5) {
				System.out.println();
				count = 0;
			}
				
		}
		*/
		//���� ���� : 2�� - ��,��(y,x)
		// �� : 5, �� �ึ�� �� : 5
		
		//���� �� = �� , 
		//�� = ��
		
		int v = 1 ;
		for(int row = 0;row<6;row++) { //��
			for (int col=0;col<5;col++) {//��
				if (v <= 25) {
					System.out.print(v+",");
					++v;
				}
			}
			System.out.println();
		}
		
	}

}
