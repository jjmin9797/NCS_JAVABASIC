package com.bit.demo4;

public class FlowArray {

	public static void main(String[] args) {
		int[][] a2 ;
		// [��][��] 2������, ǥ (table)
		// �� ��ȣ : �ǹ� �뵵 �ľ� !! �߿� !!  1.���� 2.���� 3.����
		a2 = new int[5][3];
		int count = 1;
		//2�� �迭 : 2�� for��
		for(int i = 0;i < 5 ; i ++) {
			for(int x = 0;x < 3; x++) {
				a2[i][x] = count;
				count ++;
				System.out.print(a2[i][x]+ " ");
			}
			System.out.println();
		}

		for (int c = 0; c < 5; c++) {
			for (int cc : a2[c]) {
				System.out.print(cc + " ");
			}
			System.out.println();
		}
	}
		
	
	
	public static void foreach(String[] args) {
		//�迭 �ٷ��!
		int count = 0;
		int[] a1 = new int[5] ;
//		System.out.println(a1[0]);
		//for-each : ��Ҵ���
		for (int e : a1) {
			if (e==0) {
				count ++;
				
			}
		
		}
//		System.out.println(count);
		
		
		for(int i= 0; i < a1.length; i++) {
			//a1[i] = i+10;
			//System.out.println(a1[i]);
		}
		
	}

}
