package com.bit.demo3;
import java.util.Scanner;
public class ExArray06 {
	// Ŭ���� �ȿ� �ۼ��� �� : member (�ɹ�)
	// �Լ� : method
	// ���� : field
	int cvalue; // <- field
/*	
	static int todo() { // void : method �ڷ��� ,void�� ��ȯ���� ���� !, �ҹ��ڷ� �����ؼ� �빮�ڰ� �����ִ�
		// ()�ȿ��� �����͸� �޴� �� -> �Ű�����
		//���� ����
		//���� void ��� int�� ��ٸ� �ݵ�� ������ �ؾ��Ѵ�.
		int rt = 0;
		
		return rt; // method ���� ����
	}
	*/
	
	
	
	public static void main(String[] args) { // <- main method
		// Ű���� �޴� ����  - �迭�� �߰�, ����, ���
		// Create Read Update Delete
		int[] datas = new int[20] ; // 0�� EMPTY
		Scanner sc = new Scanner(System.in);

		// ���� ���� ���� !
		while(true) {
			// 1. ��Ϻ���
			for (int i = 0 ; i < datas.length; i++) {
				if (datas[i] != 0) {
					String s = "["+i+"]";
					s += datas[i];
					System.out.println("----------------------------\n"+s);
				}//if�� ��
			}//for�� ��
			
			
			
			// 2. �޴�����
			System.out.println("----------------------------\n" +
			"[0]Exit [1]List [2]Add [3]Del\n"+
			"----------------------------"		);
			String menu = sc.nextLine();
			
			
			
			
			// 3. ���� �޴��� ���� ����
			
			//3-1 break
			if(menu.equals("0")) { //���ڵ��� ���� ��
				break;
			}// break ��
			
			
			
			//3-2 Read
			if ("1".equals(menu)) {
				
			}
			
			
			
			//3-3 Create
			if ("2".equals(menu)) {
				System.out.println("Add No. ->");
				//�迭 �߰� : ���̸� Ȯ���ϱ�
				//�� ���� ã�Ƽ� �߰��ϱ� !
				int value; // �߰��� ��
				value = sc.nextInt();sc.nextLine();
				
				int addIndex = -1 ; // ��� ��ȣ
				for(int i=0; i<datas.length; i++) {
					if (datas[i] == 0) {
						addIndex = i;
						break;
					}//if ��
				}//for��
				if (addIndex != -1) {
					datas[addIndex] = value;
				}else {
					System.out.println("Full");
				}				
			}//Create if  ��
			
			
			
			
			//3-4 Delete
			if ("3".equals(menu)) {
				System.out.println("Delete No. ->");
				int delIndex = -1 ;
				//��ȣ�� �Է¹޴´�
				delIndex = Integer.parseInt(sc.nextLine());
				if (0 <= delIndex
						&&
					delIndex <= datas.length) {
					datas[delIndex] = 0;
				}else {
					System.out.println("�߸��Է��ϼ̽��ϴ�.");
				}
				//�� ���� �����
			}//Delete if ��
			
			
			
		}//while �� ��				
		sc.close(); // ������ �ٽ� ������,, ��,,
	}//main end

}
