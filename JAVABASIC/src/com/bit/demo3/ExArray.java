package com.bit.demo3;

public class ExArray {
	/*
	 * �迭
	 * - 1��. ��������
	 * - �迭�� : ����
	 * - �� ������ : ���
	 * - �� ��Ҹ� �����ϱ� ���ؼ� ��ȣ�� ���� : ��� ��ȣ
	 * - ��Ҹ� : �迭��[��ȣ]
	 * - �ǹ� : ����� �ڷ����� ����?
	 * ------------------------------------------
	 * - Bound : ��ȣ�� ��ҵ��� �����ϰ� �����ϰ� ����
	 * - ����� ����
	 * - �ִ� ���� : �ִ���̰� 10�̸� ��� ��ȣ�� [10-1=9]���� ����� �� �ִ� !
	 * - ���� ���� : ���� ������ ����
	*/
	public static void main(String[] args) {
		// 1. �迭 ����  -> []
		int maxLength = 20;
		int[] nums; //  int���� ������ nums��� �̸��� �迭�� ����ڴ� !! ����ھ�  !! ������ !! �迭�� ����� �ƴ϶��ϴ�. �迭�� ���ž� ! ��� ���ѰŶ�� �մϴ� �����Դϴ�
		nums = new int[maxLength]; // �ִ� ���� ���� ! 2������ ������ �� �ִ� ����� �־��־�� �Ѵ�. ������밡�������� �ѹ� �������� �ٲܼ�����.
		// 2. �� ��ҵ鿡 ���� ����
		for (int i=0; i<nums.length; i++) {
			nums[i] = (i+1);
			System.out.print(nums[i]+" ");
		}
		
		// 3. ����� ������ ó�� !
		

	}

}