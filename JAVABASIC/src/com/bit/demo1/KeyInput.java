package com.bit.demo1;
import java.io.IOException;
import java.util.Scanner;
public class KeyInput {

	public static void main(String[] args) throws IOException {
		//Ű���� : byte stream ��ġ
		// 1. �ڷ����� ��ġ
		// 2. ���Է�, �߸��� �Է� ó��
		// - ���� �Է� ��ġ : �����δ� ���� (���� �ڵ�� ������ ��)
		// �Է� : �ܺο��� �츮���� � �����Ͱ� ������ ���� �ǹ��Ѵ�.
		int k = System.in.read();
		System.out.println(k); // ������ ��
		int d = System.in.read();
		System.out.println(d);
		int o = System.in.read();
		System.out.println(o);
	}

}
