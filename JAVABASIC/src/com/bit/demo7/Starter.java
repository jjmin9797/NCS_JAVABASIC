package com.bit.demo7;

public class Starter {
	
	/*
	 * �߱� ���� ����
	 * - ���, �߻�, �������̽� OOP����
	 * 
	 */
	
	public static void main(String[] args) {
		BaseBall game = new BaseBall(); //�⺻ ������
		game.start();
		//moreInher();
	}

	
	
	/*
	 * ���
	 * 1. �ڵ� ����
	 * 2. Ŭ���� ���� �� Ŭ�� ���� ���� : �θ�-�ڽ� ����
	 * 3. ���� ��Ӹ� ����
	 * 4. �ڽ� Ŭ���� extends �θ� ũ����
	 * 5. ��ü ���� �� : �θ� Ŭ������ ���� == new �ڽ�Ŭ����()
	 * 6. �������̵�(override) : �θ��� �޼��带 ��ü�Ѵ�.
	 * - �θ� Ŭ������ �����ϴ� ���� ����� �Ѵ�.
	 * 7. ����ȯ �� new �ڿ� Ŭ���� Ȯ��
	 * - (�ڽ�Ŭ����)�ν��Ͻ��� ; <- �ش� �ν��Ͻ��� 
	 * - ��� Ŭ������ �θ�Ǵ� Object : �ڷ��� ����, ��Ȯ���� �������
	 */
	
	
	/*
	 * �߻� Ŭ����
	 * - �̿ϼ� !(�޽��� �� ���ǵ��� ���� ���� �ִ�. : �߻� �޼���)
	 * - ��ü�� ������ �� ���� !
	 * - ����ü Ŭ���� ���� �� ����ؾ� �Ѵ�.
	 * 
	 * �������̽� (Ŭ���� �ƴ�!!)
	 * - �߻� �޼��常 �� �� �ִ�.
	 * - ������ ��ũ ���� �ݵ�� ���ذ� �ʿ��ϴ�
	 * 
	 * 
	 */
	
	
	static void moreInher() {
		Phone myPhone = new Phone();
		myPhone.call();
		myPhone.rcv();
	
		SmsPhone momPhone = new SmsPhone("010-3333-3333");
		momPhone.call();
		momPhone.rcv();
		momPhone.send();
		momPhone.read();
		
		
		Object objPhone = new SmsPhone("010-3333-3333");
		String name = objPhone.getClass().getName();
		System.out.println(name);
	//	objPhone.call();
	//	objPhone.rcv();
//		objPhone.send();
	//	objPhone.read();
	}
	
	
	
}
