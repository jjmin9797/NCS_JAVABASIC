package com.bit.demo2;

public class Loop {

	public static void main(String[] args) {
		//���� ������ : ���� ���� ��ġ { }
		/*int n;
		{
			int lo ;
			lo = 20 ;
			n = lo;
		}
		System.out.println(n); // n �� lo�� ������ �޴´�.*/
		//~�������� ~���� ~�� ���Ѵ�.
		// �� �� �����ϳ�?
		for(int a = 0; a < 100; a++) {
			//�ѹ� ����
			for (int c = 0; c < 10 ; c += 1) {
				System.out.println(a + c);
			}
		}
	}

}
