package com.bit.demo1;
import java.util.Random;
public class Expression2 {

	public static void main(String[] args) {
		/*
		double d = Math.random();
		System.out.println("Random : " + d);
		d = Math.random();
		System.out.println("Random : " + d);
		d = Math.random();
		System.out.println("Random : " + d);
		*/
		Random ran = new Random(); //인스턴스 생성
		int a = ran.nextInt();
		double d = ran.nextDouble();
		String s = "123"; // 숫자열
		int m = Integer.parseInt(s);
		double dm = Double.parseDouble(s);
		System.out.println(dm);
		
	}

}
