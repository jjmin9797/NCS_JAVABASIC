package com.bit.demo1;
import java.io.IOException;
import java.util.Scanner;
public class Quiz {

	public static void main(String[] args) throws IOException {
		//Ű���� �Է� �޾Ƽ� 0~9���� ��µȴ�...
		int n;
		int m;
		n = System.in.read();
		m = n % 10;
		System.out.println(m);
		
	}

}

// ---����---
//Ű���� �Է� �޾� ���� �ܾ�,���� ���� �ľ�
//������ ��� ->���� ���� �������� ���
// �Է� : ���� + ���� ���
// ��� : �ܾ�,���� ���� ���, ���� ���
// �ܾ ���� ����, ������ ���� ����
// 
