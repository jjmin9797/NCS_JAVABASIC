package com.bit.demo3;

public class ExArray04 {

	public static void main(String[] args) {
		//stack
		
		int[] score = new int[10];
		int sp = 0;
		
		// �߰��ϱ⸦ �� ���� [sp]���� ���� ! sp++
		for (int i=0; i<3; i++) {
			score[sp] = 1;
			++sp;
		}
		// ����� �� ������ sp-- �׸��� [sp]�� ������.
		for (int i=0; i<3; i++) {
			--sp;
			System.out.println(score[sp]);
			
		
		}
		
		System.out.println(sp);
	}

}
