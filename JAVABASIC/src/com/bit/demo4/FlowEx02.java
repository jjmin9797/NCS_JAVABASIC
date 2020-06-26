package com.bit.demo4;

public class FlowEx02 {
	
	
	public static void main(String[] arg) {
		int[] a = new int[4];
		int[] b = new int[4];
		b[0] = 10;
		System.out.println(a[0]);
		if (a==b) {
			System.out.println("same");
			
		}else {
			System.out.println("diff");
			
		}
	}

	public static void main01(String[] args) {
		String name = "jangs" ;
		String nick = new String("jangs") ;
		if (name.equals(nick)) { //문자열 참조 비교, 문자열 값!
			System.out.println("same");
			
		}else {
			System.out.println("diff");
		}

	}

}
