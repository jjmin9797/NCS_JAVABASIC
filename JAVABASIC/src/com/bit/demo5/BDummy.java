package com.bit.demo5;

public class BDummy {
	//  ������� ������ : private(�ʵ�), public(�޼���)
	// Ŭ������ ������� ������ �ִ�!
	private int value=3;
	
	public int getValue() {
		return value;
	}
	
	public void setValue1(int value) {
		this.value = value;
	}
	//setter�� ��� ���� ��ü����ȯ�Ҷ��� �ִ�.
	public BDummy setValue2(int value) {
		//int temp ; // ��������
		this.value = value;
		return this;
	}
}
