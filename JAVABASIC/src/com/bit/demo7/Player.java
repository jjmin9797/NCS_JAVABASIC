package com.bit.demo7;

import java.util.Random;

/**
 * 야구 게임 시 선수의 역할 클래스
 * -모든 선수는 이 클래스의 동작을 할 수 있어야 한다.
 * @author JM
 *
 */
public class Player {
	private int Answer1;
	private int call; // 내가 부른 값을 들고 있어야 한다.
	private Random random;
	public Player() {
		
		random = new Random();
		//Answer1 = 333;
		Answer1 = random.nextInt(900) + 100;
		//야구 게임 규칙은 중복 없는 3자리
	}

	
	public void setAnswer(int arg) {
		this.Answer1 = arg;
	}
	
	public int getAnswer() {
		return this.Answer1;
	}
	/**
	 * @author Jungmin
	 * 
	 * @return "상대방에게 내 숫자를 부른당! ㅎㅎ"
	 * 상대에게 부를 값을 계산하는 메서드 
	 */
	public int call() {
		//처음 부를 때 -> 임의의 수 -> 초기값을 보고
		if (call==0) {
			call = random.nextInt(898) + 102;
		}
		return call;
	}
	
	public int[] resp(int call) {
		int strike = 0;
		int ball = 0;
		String sa = "" + Answer1;
		String sc = String.valueOf(call);
		for(int i= 0; i <3; i++) {
			for(int k = 0; k < 3; k++) {
				if(sa.charAt(i) == sc.charAt(k)) {
					if (i == k ) {
						++strike;
					}else {
						++ball;
					}
				}				
			}
		}
		return new int[] {strike, ball};
	}
	
	
	
	public void listen(int[] result) {
		// 아까 부른 값과 그 대답을 비교
		// 다음에 부를 값을 예상!
		call = random.nextInt(898) + 102;

		
	}
	
	
}






	


	

	

