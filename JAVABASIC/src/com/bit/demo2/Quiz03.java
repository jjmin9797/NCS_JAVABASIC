package com.bit.demo2;

import java.io.IOException;

public class Quiz03 {

	public static void main(String[] args) throws IOException {
		int k;
		int dCount = 0;
		int aCount = 0;
		int uCount = -1;
		while ((k=System.in.read()) != '\n') {
			if('0' <= k && k <= '9') {
				dCount++;
				int i = k-48; // 정수로 만든다 ! 숫자에서 !
				System.out.print(i+" ");
			}
			else if(('A' <= k && k <= 'Z')
					||
					('a' <= k && k <= 'z'))
					//영문자이다
			{
				aCount ++;
			}
			
			else {
				uCount++;
			}
		}
		String s = "";
		String s2 = "";
		String s3 = "";
		s += "\nInteger Didgits : " +dCount; // s = s + dCount
		s2 += "String Didgits : " +aCount;
		s3 += "Unknown Didgits : " + uCount;
		System.out.println(s);
		System.out.println(s2);
		System.out.println(s3);
	}

}
