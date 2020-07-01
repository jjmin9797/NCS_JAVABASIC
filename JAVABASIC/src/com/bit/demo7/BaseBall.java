package com.bit.demo7;

/*
 * �߱� ���ӿ� ���� ��ü���� ���� ����
 */
public class BaseBall {
	/*
	 * �޼��� �Ű����� ���� ����
	 * - ���� �� �ݵ�� ���� �޾ƾ� �Ѵ�.
	 * - ���� ���� ���� ��� ������ �� ����..
	 */
	
	public void start() {
		// ���� ��Ű���� ��� ����� �� �ִ�(default)
		System.out.println("BaseBall Game ! ");
		//���� ���� -> player1, player2
		// ���� ���� Ŭ���� ��Ƽ� �ϳ� ���α׷� : ��Ģ, �ϰ�
		Player[] py = new Player[] {new Jang(), new Kims()};
		String[] name = new String[] {
			((Jang)py[0]).getName(),
			((Kims)py[1]).getName(),
		};
		//������ (�ڷᱸ��), ����
		
		//���� ���� ���ϱ� : ������ ��� !

		
		int count = 0;
		int strike = 0 ;
		int ball = 0;
		int caller = 0; //py �迭 ��� ��ȣ
		while (true) {
			// ���� ������ : () ?���̸� ���� ���� :�����̸� �������			
			// a�� b���� �θ���			
			int call = py[caller].call();
			// b�� a���� ����Ѵ�
			int[] result = py[1-caller].resp(call);
			// a�� b�� ����� ��� ���� ���� �����Ѵ�
			py[caller].listen(result);
			// ���߸� �����Ѵ�.
			strike = result[0];
			ball = result[1];	
			
			
			
			//Test Zone
//			int key = py[caller].getAnswer();
//			System.out.println(key);
//			System.out.println(call);
			//Test Zone
			
			
			
			
			if (strike == 3) {
				System.out.println( "S : " + strike + "    B : " + ball );
				System.out.println("End Game\n" + count + " ��° ��\n" + name[caller] + "�� �̰�� !"
						+ "������ : " );		
				break;
				
			}//if end
			//���� ��Ȳ ���
			System.out.println(name[caller]+ " : " + call + "->");
			System.out.println( "S : " + strike + "    B : " + ball );
			//���� �ٲٱ�
			caller = 1 - caller;
			count++;
		}//while end
		
	}//start end
	
	//������ �ǹ��ϴ� �޼���
	

	
}//class end
