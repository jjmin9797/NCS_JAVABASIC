package com.bit.demo7;

import java.util.Random;

public class Kims extends Player{
	private Random random;
	private String name = "Kims";
	//�θ��� �޼��� �� �ϳ��� ��ü�ϰ� �ʹ� !
	
	//call�� �����ðž�
	@Override
	
	public int call() {
		if(random == null) {
			random = new Random();
			//�ʱⰪ
		}
		int ran = random.nextInt(900) + 100;
		return ran;
	}
	
	public String getName() {
		return name;
	}
}
