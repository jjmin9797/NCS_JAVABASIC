package com.bit.demo4;
import java.awt.Frame;
public class ParkingManagementSystem {

	public static void main(String[] args) {
		/*
		 * 1. 누가 사용할 것이냐
		 * - 주차장 사장님(관리자)
		 * 2. 필요로하는 정보(결과) 무엇이냐
		 * - 금액? -> 돈계산 ! -> 돈계산에 필요한 값들이 뭘까?
		 * 3. 요금 <=  시간 (체류시간 : 들어온시간, 나가는 시간)
		 * 4. 주차되는 차들 최소한 2개의 값이 필요 !
		 * 5. 자료형, 자료구조
		 * - 정수, 실수  int , double, []
		 * 6. 기능 정의 : CRUD
		 * C : 차가 들어온다
		 * R : 주차된 차를 검색한다
		 * U : 특별한 상황에서 차량 시간을 수정한다
		 * D : 차가 나간다.
		 *  연산자 메서드 라이브러리 !
		 *  //https://coding-factory.tistory.com/261
		 *  //https://d2.naver.com/helloworld/645609
		 *  코딩 !
		 */
		Frame f = new Frame();
		f.setTitle("Parking Management System");
		f.setSize(600,600);
		f.setVisible(true);
	}

}
