package com.bit.demo7;

public class Phone {
	private String number;
	//�����ڸ� ���� �� ���� �� �ִ�. overloading
	// �̸��� ����, �Ű������� �ٸ� �޼��� ������...
	// �Ű������� �ٸ��� ! -> ����, �ڷ���
	public Phone() {
		number = "010-8652-7993";
		System.out.println(1);
	}
	
	public Phone(String number) {
		this.number = number;
		System.out.println(2);
	}
	
	public void call() {
		System.out.println("��ȭ �ɱ�"+ number);
	}
	
	public void rcv() {
		System.out.println("��ȭ �ޱ�");
	}
}
