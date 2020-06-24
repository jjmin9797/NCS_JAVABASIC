package com.bit.demo2;

import java.util.Random;

public class Quiz01 {

	public static void main(String[] args) {
		int number;
		for (int i = 0; i<=10;i++) {
			Random ran = new Random();
			number = ran.nextInt(1000);
			System.out.println(number);
		}

	}

}
