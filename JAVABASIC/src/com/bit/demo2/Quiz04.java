package com.bit.demo2;

import java.io.IOException;

public class Quiz04 {
	public static void main(String[] args) throws IOException {
		int k ;
		int dCount = 0 ; 
		int num = 0; // 각 정수들
		int total = 0; //정수 총합
		while ((k=System.in.read()) != '\n') {
			if('0' <= k && k <= '9') {
				if ( dCount == 0) {
					num = k-48;
				}else {
					num = (num * 10) +(k-48);
				}
				dCount = 1 ;
			}
			else if(('A' <= k && k <= 'Z')
					||
					('a' <= k && k <= 'z'))
					//영문자이다
			{
				total = total + num ;
				num = 0;				
				dCount = 0;				
			}
			else {
				total = total + num ;
				num = 0;				
				dCount = 0;
			}
		}//while  끝
		String key = "";
		char cad = 66;
		key = "Total Number : " + total ;
		System.out.println(key);
		System.out.println(cad);
	}//main 끝
}//class  끝