package com.bit.demo3;

public class ExArray05 {

	public static void main(String[] args) {
		//�� �ڸ��� ã�ƶ� !...
		//����� : 0 ~ 100
		int[] score = new int[20] ;
		int EMPTY = 999;
		for (int i=0; i<score.length; i++) {
			System.out.println(score[i]);
			score[i] = EMPTY; // ���ڸ��� �ǹ���			
		}
		//�� ����� ��ȣ�� �˻��Ͻÿ� !
		int empty_index= EMPTY ;
		for (int i=0; i<score.length; i++) {
			if(score[i] == EMPTY) {
				empty_index = i;
				//�ϳ��� ã�� ���
				break; //ù��°���� ����� �Ⱦ��� ������ ���� ã�´�
			}
		}
		//������ !
		if (empty_index != EMPTY) {
			System.out.println(empty_index);
		}else {
			System.out.println
			("Nob!");
		}
		
	}

}
