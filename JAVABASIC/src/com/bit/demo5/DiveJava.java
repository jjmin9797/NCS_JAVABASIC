package com.bit.demo5;

public class DiveJava {
	//Java Object Oriented Programming
	//��ü : ���� �޸𸮿� �ִ� ... (instance)
	//Ŭ���� : 1) �ڷ���-������  2) ��ü�� ����(Ʋ)
	// -������ �Լ����� ����!
	// 1. �ҽ����� : source file
	//		{ Ŭ���� �� }.java
	// 		ù ���� �빮��(����) Ư������, ��ȣ ���Ұ�
	// 2. ���ϸ� (Ŭ������)�� ���� class �����ϱ�
	// 3. member���� �ۼ�(����, ����, ����)
	// 4. new ��ɾ ����Ͽ� (�ν��Ͻ�)�� ����!
	// 5. �ν��Ͻ��� ����, �Լ����� ����ؼ� ó��
	// member :���� : field
	// ������ �ڷ��� ������;
	// Java Bean : �ʵ�� �� �ʵ忡 ���� ����� �޼���
	// 				-> �ڷ��� ����, �����ӿ�ũ
	
	
	
	// member : �Լ� : method
	// ������ ��ȯ�� �޼����(�Ű�����...) {
	//     ���೻��
	//     �������� ����..?
	
	int number; // �ν��Ͻ� ���� : ��� �ν��Ͻ����� ������ ������ �������̴�.
	// get; set; �ʿ�
	static int serial; // Ŭ���� ���� : ��� ���� ���� ������.
	// Ŭ������.serial = 100 ; <- ���� ����
	int getNumber () { // getter <- �ʵ带 ��ȯ(���)�ϴ� �Լ� 
		return number;
	}
	
	void setMember(int arg) { //setter <- 
		number = arg; 
	}
	
	public static void main(String[] args) {
		

	}

}
