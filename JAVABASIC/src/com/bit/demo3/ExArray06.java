package com.bit.demo3;
import java.util.Scanner;
public class ExArray06 {
	// 클래스 안에 작성된 것 : member (맴버)
	// 함수 : method
	// 변수 : field
	int cvalue; // <- field
/*	
	static int todo() { // void : method 자료형 ,void는 반환값이 없다 !, 소문자로 시작해서 대문자가 섞여있는
		// ()안에는 데이터를 받는 곳 -> 매개변수
		//실행 내용
		//만약 void 대신 int를 썼다면 반드시 리턴을 해야한다.
		int rt = 0;
		
		return rt; // method 종료 선언
	}
	*/
	
	
	
	public static void main(String[] args) { // <- main method
		// 키보드 메뉴 선택  - 배열에 추가, 삭제, 목록
		// Create Read Update Delete
		int[] datas = new int[20] ; // 0은 EMPTY
		Scanner sc = new Scanner(System.in);

		// 실제 실행 내용 !
		while(true) {
			// 1. 목록보기
			for (int i = 0 ; i < datas.length; i++) {
				if (datas[i] != 0) {
					String s = "["+i+"]";
					s += datas[i];
					System.out.println("----------------------------\n"+s);
				}//if문 끝
			}//for문 끝
			
			
			
			// 2. 메뉴선택
			System.out.println("----------------------------\n" +
			"[0]Exit [1]List [2]Add [3]Del\n"+
			"----------------------------"		);
			String menu = sc.nextLine();
			
			
			
			
			// 3. 선택 메뉴에 따라 실행
			
			//3-1 break
			if(menu.equals("0")) { //문자들이 여러 개
				break;
			}// break 끝
			
			
			
			//3-2 Read
			if ("1".equals(menu)) {
				
			}
			
			
			
			//3-3 Create
			if ("2".equals(menu)) {
				System.out.println("Add No. ->");
				//배열 추가 : 길이를 확인하기
				//빈 곳을 찾아서 추가하기 !
				int value; // 추가할 값
				value = sc.nextInt();sc.nextLine();
				
				int addIndex = -1 ; // 요소 번호
				for(int i=0; i<datas.length; i++) {
					if (datas[i] == 0) {
						addIndex = i;
						break;
					}//if 끝
				}//for끝
				if (addIndex != -1) {
					datas[addIndex] = value;
				}else {
					System.out.println("Full");
				}				
			}//Create if  끝
			
			
			
			
			//3-4 Delete
			if ("3".equals(menu)) {
				System.out.println("Delete No. ->");
				int delIndex = -1 ;
				//번호를 입력받는다
				delIndex = Integer.parseInt(sc.nextLine());
				if (0 <= delIndex
						&&
					delIndex <= datas.length) {
					datas[delIndex] = 0;
				}else {
					System.out.println("잘못입력하셨습니다.");
				}
				//빈 곳을 만든다
			}//Delete if 끝
			
			
			
		}//while 문 끝				
		sc.close(); // 닫으면 다시 못연다,, 후,,
	}//main end

}
