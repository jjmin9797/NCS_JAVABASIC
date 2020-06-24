package com.bit.demo1;
import java.util.Scanner;
public class Operators2 {

	public static void main(String[] args) {
		int i ;
		int num = 0;
		double d;
		Scanner scanner = new Scanner(System.in);
		int od = scanner.nextInt();
		for (int a = 0 ; a < 3; a +=1) {
			d = Math.random();
			i = (int)((d*100) % 9 + 1);
			num = num * 10 + i;
			System.out.println(a);
			System.out.println(od);
		}
		
		/*
		d = Math.random();
		i = (int)((d*100) % 9 + 1);
		num = num * 10 + i;
		
		d = Math.random();
		i = (int)((d*100) % 9 + 1);
		num = num * 10 + i;
		
		d = Math.random();
		i = (int)((d*100) % 9 + 1);
		num = num * 10 + i;
		*/
		System.out.println(num);
	}

}
