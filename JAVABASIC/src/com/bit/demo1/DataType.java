package com.bit.demo1;




public class DataType {

	public static void main(String[] args) {
		//�⺻ �ν� ����
		//������ ���� ���� �Ǵ�, �ش� �ڷ����� ������ �����.
		boolean b1 = true;
		boolean b2 = false;
		char c1 = 'A';
		
		//����
		int i1 = 10; // 4����Ʈ
		short i2 = 20; // 2����Ʈ
		long i3 = 30 ; // 8����Ʈ -> DB���� ���� ����
		
		//�Ǽ�
		float f2 = 1.34F; //4����Ʈ �ڿ� F�� �ٿ�����. �� ���� ���� ������?
		double f1 = 12.34;//8����Ʈ
		
		// ���� ���� ���� ������ ����ϰ� ���� �� -> ���ڿ� + �������� ��� ��ĥ �� �ִ�.
		String str = "";
		str = str + i1 + i2 + b1 ;
		String s1 = "A";
		System.out.println(str);
	}

}
