package com.bit.demo2;

import java.io.IOException;

public class Quiz04 {
	public static void main(String[] args) throws IOException {
		int k ;
		int dCount = 0 ; 
		int num = 0; // �� ������
		int total = 0; //���� ����
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
					//�������̴�
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
		}//while  ��
		String key = "";
		char cad = 66;
		key = "Total Number : " + total ;
		System.out.println(key);
		System.out.println(cad);
	}//main ��
}//class  ��