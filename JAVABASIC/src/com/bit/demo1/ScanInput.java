package com.bit.demo1;
import java.util.Scanner;
public class ScanInput {

	public static void main(String[] args) {
		/*
		 * ��𿡼� ~ ������ ���� ���ϴ� �ڷ������� ��ȯ
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); //�Էµ� ���ڰ���  int��ȯ
		sc.nextLine(); // ���ۿ� ���� ���ڸ� �� ������
		String b = sc.nextLine(); // ���ڿ� �״�� ��ȯ
		System.out.println(a);
		System.out.println(b);
	}

}
