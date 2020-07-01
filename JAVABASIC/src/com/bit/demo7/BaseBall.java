package com.bit.demo7;

/*
 * 야구 게임에 대한 전체적인 실행 내용
 */
public class BaseBall {
	/*
	 * 메서드 매개변수 선언 여부
	 * - 선언 시 반드시 전달 받아야 한다.
	 * - 선언 하지 않은 경우 전달할 수 없다..
	 */
	
	public void start() {
		// 같은 패키지인 경우 사용할 수 있다(default)
		System.out.println("BaseBall Game ! ");
		//선수 입장 -> player1, player2
		// 여러 개의 클래스 모아서 하나 프로그램 : 규칙, 일관
		Player[] py = new Player[] {new Jang(), new Kims()};
		String[] name = new String[] {
			((Jang)py[0]).getName(),
			((Kims)py[1]).getName(),
		};
		//여러개 (자료구조), 선택
		
		//각자 정답 정하기 : 생성자 써라 !

		
		int count = 0;
		int strike = 0 ;
		int ball = 0;
		int caller = 0; //py 배열 요소 번호
		while (true) {
			// 조건 연산자 : () ?참이면 여기 실행 :거짓이면 여기실행			
			// a가 b에게 부른다			
			int call = py[caller].call();
			// b가 a에게 대답한다
			int[] result = py[1-caller].resp(call);
			// a가 b의 대답을 듣고 다음 수를 예상한다
			py[caller].listen(result);
			// 맞추면 종료한다.
			strike = result[0];
			ball = result[1];	
			
			
			
			//Test Zone
//			int key = py[caller].getAnswer();
//			System.out.println(key);
//			System.out.println(call);
			//Test Zone
			
			
			
			
			if (strike == 3) {
				System.out.println( "S : " + strike + "    B : " + ball );
				System.out.println("End Game\n" + count + " 번째 턴\n" + name[caller] + "가 이겼어 !"
						+ "정답은 : " );		
				break;
				
			}//if end
			//진행 상황 출력
			System.out.println(name[caller]+ " : " + call + "->");
			System.out.println( "S : " + strike + "    B : " + ball );
			//순서 바꾸기
			caller = 1 - caller;
			count++;
		}//while end
		
	}//start end
	
	//선수를 의미하는 메서드
	

	
}//class end
