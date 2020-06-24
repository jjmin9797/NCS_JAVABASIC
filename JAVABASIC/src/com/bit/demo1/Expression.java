package com.bit.demo1;

public class Expression {

	public static void main(String[] args) {
		// 1~25 사이의 정수 3개를 출력하세요.
		//for (int a = 0; a < 10 ; a +=1) {
		//	System.out.println(a);
		//} 
		double d = Math.random();
		
		int i1 =((int)(d* 1000 )%25+1);
		d = Math.random();
		int i2 =((int)(d* 1000 )%25+1);
		d = Math.random();
		int i3 =((int)(d* 1000 )%25+1);
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
	}

}
