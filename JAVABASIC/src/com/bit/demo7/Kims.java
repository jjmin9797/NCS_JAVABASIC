package com.bit.demo7;

import java.util.Random;

public class Kims extends Player{
	private Random random;
	private String name = "Kims";
	//부모의 메서드 중 하나를 교체하고 싶다 !
	
	//call을 가져올거얌
	@Override
	
	public int call() {
		if(random == null) {
			random = new Random();
			//초기값
		}
		int ran = random.nextInt(900) + 100;
		return ran;
	}
	
	public String getName() {
		return name;
	}
}
