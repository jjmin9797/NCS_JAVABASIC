package com.bit.demo3;

public class ExArray03 {

	public static void main(String[] args) {
		int[] score = new int[10]; // score.length
		// 0���������� �ϳ��� ����, �߰�
		int last = 0; // �迭�� ��ҹ�ȣ�� ���!
		score[last] = 1; 
		++last;
		score[last] = 2;
		++last;
		System.out.println(last + " ���� ���� �ߴ�. ");
		System.out.println(last-1 + " �� �����ߴ�");
		if (last < score.length) {
			score[last] = 3;
			++last;
			
		}else {
			System.out.println("Full");
		}
	}

}
