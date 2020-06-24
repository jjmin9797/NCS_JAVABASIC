package com.bit.demo2;

import java.util.Random;

public class Quiz02 {

	public static void main(String[] args) {
		int number ;
		int t;
		Random ran = new Random();
		for (int i=0 ; i<10 ; i++) {
			number = 0;
			t = ran.nextInt(9)+1;
			number = number * 10 + t;
			t = ran.nextInt(10);
			number = number * 10 + t;
			t = ran.nextInt(10);
			number = number * 10 + t;
			System.out.println(number);
		}

	}

}
