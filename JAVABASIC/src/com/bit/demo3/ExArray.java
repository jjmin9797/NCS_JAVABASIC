package com.bit.demo3;

public class ExArray {
	/*
	 * 배열
	 * - 1차. 선형구조
	 * - 배열명 : 참조
	 * - 각 데이터 : 요소
	 * - 각 요소를 구분하기 위해서 번호를 붙임 : 요소 번호
	 * - 요소명 : 배열명[번호]
	 * - 의미 : 요소의 자료형이 뭐냐?
	 * ------------------------------------------
	 * - Bound : 번호로 요소들을 지정하고 구분하고 관리
	 * - 요소의 개수
	 * - 최대 길이 : 최대길이가 10이면 요소 번호는 [10-1=9]까지 사용할 수 있다 !
	 * - 현재 길이 : 실제 저장한 개수
	*/
	public static void main(String[] args) {
		// 1. 배열 선언  -> []
		int maxLength = 20;
		int[] nums; //  int값을 저장할 nums라는 이름의 배열을 만들겠다 !! 만들겠어  !! 하하하 !! 배열을 만든게 아니랍니다. 배열을 쓸거야 ! 라고 말한거라고 합니다 참조입니다
		nums = new int[maxLength]; // 최대 길이 지정 ! 2개까지 저장할 수 있다 상수만 넣어주어야 한다. 변수사용가능하지만 한번 정해지면 바꿀수없다.
		// 2. 각 요소들에 값을 저장
		for (int i=0; i<nums.length; i++) {
			nums[i] = (i+1);
			System.out.print(nums[i]+" ");
		}
		
		// 3. 저장된 값들을 처리 !
		

	}

}
