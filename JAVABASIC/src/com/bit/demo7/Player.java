package com.bit.demo7;

import java.util.Random;

/**
 * �߱� ���� �� ������ ���� Ŭ����
 * -��� ������ �� Ŭ������ ������ �� �� �־�� �Ѵ�.
 * @author JM
 *
 */
public class Player {
	private int Answer1;
	private int call; // ���� �θ� ���� ��� �־�� �Ѵ�.
	private Random random;
	public Player() {
		
		random = new Random();
		//Answer1 = 333;
		Answer1 = random.nextInt(900) + 100;
		//�߱� ���� ��Ģ�� �ߺ� ���� 3�ڸ�
	}

	
	public void setAnswer(int arg) {
		this.Answer1 = arg;
	}
	
	public int getAnswer() {
		return this.Answer1;
	}
	/**
	 * @author Jungmin
	 * 
	 * @return "���濡�� �� ���ڸ� �θ���! ����"
	 * ��뿡�� �θ� ���� ����ϴ� �޼��� 
	 */
	public int call() {
		//ó�� �θ� �� -> ������ �� -> �ʱⰪ�� ����
		if (call==0) {
			call = random.nextInt(898) + 102;
		}
		return call;
	}
	
	public int[] resp(int call) {
		int strike = 0;
		int ball = 0;
		String sa = "" + Answer1;
		String sc = String.valueOf(call);
		for(int i= 0; i <3; i++) {
			for(int k = 0; k < 3; k++) {
				if(sa.charAt(i) == sc.charAt(k)) {
					if (i == k ) {
						++strike;
					}else {
						++ball;
					}
				}				
			}
		}
		return new int[] {strike, ball};
	}
	
	
	
	public void listen(int[] result) {
		// �Ʊ� �θ� ���� �� ����� ��
		// ������ �θ� ���� ����!
		call = random.nextInt(898) + 102;

		
	}
	
	
}






	


	

	

