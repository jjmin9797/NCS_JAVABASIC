package com.bit.demo1;

public class Operators {

	public static void main(String[] args) {
		//������ !
		// - ������ ����� �����̳ĸ� ����
		// - ������ 1�� �̻��� ����� ���� -> ��
		// - ����� ���� �� -> ���ǽ�
		// - ������ : ���� �ʿ��� �Ҿ�, �Ǵ� �ٰ�, ����

		
		//��� ������
		//����θ� ���
		int a = 1234/100;
		int b = 1234%100;
		String str = "";
		str = "��� ������ : " + str + a + '/'+ b ;
		System.out.println(str);
		//���� ������
		if (a != 0) {
			System.out.println("����");
		}
		// -> �� ���� ũ�⸦ ���Ѵ�.
		// ~����
		//�� ������
		// -> �� ���� ��, ���ǽ��� ���� ���� �ִ�
		// AND-&& OR-|| NOT-!
		// NOT ���� - �ݴ�� �����.
		if (a != 0 && a > 0) {
			System.out.println("�Ѵٴ�");
		}
		
		/*
		 * A     B   ��->  AND  OR   
		 * T     T   ��->   T    T
		 * F     F   ��->   F    F
		 * T     F   ��->   F    T
		 * F     T   ��->   F    T
		 * AND -> �Ѵ� ���� ��  OR -> �� �� �ϳ��� ���̸� ��
		 */
		
		
	}

}
