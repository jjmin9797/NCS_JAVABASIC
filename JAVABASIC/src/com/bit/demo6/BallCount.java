package com.bit.demo6;
import java.util.Scanner;
public class BallCount {
	
	
	static int[] count(int a, int b) {
		
		char[] taja1 = new char[3];
		char[] taja2 = new char[3];
		int[] cc = new int[2];
		int aa = 0;
		int bb = 0;				
		int com = 100;
		
		for (int i=0; i <3 ; i++) {
			taja1[i] = (char)(a/com);
			taja2[i] = (char)(b/com);
			a = a - ((int)(taja1[i]) * com) ;
			b = b - ((int)(taja2[i]) * com) ;
			com = com/10;
		}		
		
		for (int x = 0; x <3; x++) {
			for(int y = 0; y<3;y++) {
				if (taja1[y] == taja2[x]) {
					if(x==y) {
						aa = aa + 1;
					}else {
						bb = bb + 1;
					}										
				}
			}
		}		
		cc[0] = aa;
		cc[1] = bb;		
		return cc;
		
		// 1. a�� b�� char[] �迭�� ��ȯ
		// 2. �迭�� Ư¡�� ��ġ�� ���� ǥ���� �����ϴ�!
		// �� �迭�� ���ؼ� 
		// ���� �����鼭 ��ġ�� ������ [0]++
		// ���� �����鼭 ��ġ�� �ٸ��� [1]++
		// ����� �迭�� ��ȯ�ϰ� ����
		

	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int[] ballcount = count(num1,num2);
		System.out.println("Strike : " + ballcount[0]);
		System.out.println("Ball : " + ballcount[1]);

	}

}
