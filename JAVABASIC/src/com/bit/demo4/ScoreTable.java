package com.bit.demo4;
import java.util.Random;
public class ScoreTable {

	public static void main(String[] args) {
		//�л��� 5�� ������ ���� ��� �ۼ�
		int[][] stu = new int[5][5] ;
		Random ran = new Random();
		
		for(int i = 0; i < 5; i++) {
			for(int x = 0; x < 3; x ++) {
				stu[i][x] = ran.nextInt(10);
			}
		}
		
		for(int y = 0; y < 5; y++) {
			int sum ;
			sum = stu[y][0] + stu[y][1] + stu[y][2];
			stu[y][3] = sum ;
			System.out.println(sum);
			stu[y][4] = sum / 3;
			System.out.println(stu[y][4]);
			sum = 0;
		}
		
		System.out.println("��ȣ\t����\t����\t����\t����\t���");
		for(int z = 0; z <5 ; z++) {
			for(int o : stu[z]) {
				System.out.print(z+1+"\t");
				System.out.print(o);
			}
			System.out.println();
		}
		
	}

}
