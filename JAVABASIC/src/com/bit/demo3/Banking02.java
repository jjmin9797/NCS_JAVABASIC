package com.bit.demo3;
import com.bit.demo3.Banking;
public class Banking02 {
	// ��� ��ȣ�� �ǹ̸� ���� ! [0]�Ա�, [1]���, [2]�ܾ�
	static int ctotal ;
	static int[][] table = new int[10][];
	static int row;
	//��Ż�� ��ȯ �޼���
	static int getTotal() {
		int rt = 0;
		rt = ctotal;
		return rt;
	}
			
	// �迭�� �ּҸ� ��ȯ�Ѵ�... �ݵ�� new�� ������ ���̾�� ��.
	//�Ա� �޼��� ! �Աݱݾ��� ������ �Աݾ�:��ݾ�:�ܾ� ���� ��ȯ
	static int[] deposit(int arg) {
		//�ܾ� ��������
		int total = getTotal();
		total+=arg;
		ctotal = total;
		int[] event = new int[3];
		event[0] = arg;
		event[1] = 0;
		event[2] = total;
		return event;
	}
	
	//��� �޼���
	static int[] withdraw(int arg) {
		//�ܾ� ��������
		int total = getTotal();
		total-=arg;
		ctotal = total;
		int[] event = new int[3];
		event[0] = 0;
		event[1] = arg;
		event[2] = total;
		return event;
	}
	
	
	public static void main(String[] args) {
		int[] event = deposit(1000);
		table[row] = event;
		row++;
//		System.out.println(event[0] + ":" + event[1] + ":" + event[2]);
		
		event = withdraw(500);
		table[row] = event;
		row++;
//		System.out.println(event[0] + ":" + event[1] + ":" + event[2]);
		
		for (int i=0; i < row ; i++) {
			int[] a = table[i];
			System.out.println(a[0] + ":" + a[1] + ":" + a[2] );
		}
		
	}

}
