package com.bit.demo5;
//2개의 메서드 
// 1.  toString()
// 2.  생성자란?

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;

public class CarParking {
	// 생성자는 new명령 실행시 호출되는 메서드이다. -> 기본생성자는 VM에 의해 자동으로 작성되고 호출된다 !
	// 반환형은 아예 적지 않는다. 클래스 명과 일치
	// 생성자를 작성하면 기본 생성자는 없어진다...
	// 객체 생성 시 필요한 초기화 동작한다.
	// 상속을 받는다 ...> 필드들을 모아 문자열을 만든다

	private Car[] space;
	private int idx = 0;
	public CarParking(int length) {
		space = new Car[length];
	}

	
	
	
	public Car getCarByNo (String carNo) {
		for (Car car : space) {
			if(car != null) {
				if(car.getId().equals(carNo)) {
					return car;
				}
			
			}
		}
		
		return null;
	}
	
	
	
	
	
	public void insert(String carNo, Date in, double price) {
		Car car = new Car();
		car.setId(carNo);
		car.setIn(in);
		car.setOut(null);
		car.setPrice(price);
		//주차하기
		int i = isEmpty();
		if(i >= 0) {			
			space[i] = car;
		}
		
		/*
		Car car = new Car();
		car.setId(id);
		car.setIn(in);
		car.setOut(out);
		car.setPrice(a);
		space[idx] = car;
		idx++;
		System.out.println(space[0]);
		*/
	}
	//저작권 !
	public int isEmpty() {
		for (int i=0;i<space.length;i++) {
			if(space[i] == null) { //배열 요소가 객체이므로 null
				return i;
			}
		}
		return -1;
	}
	
	
	public void getCar(String num) {
		
			
		
	}
	
	
	public String getState() {
		return this.toString();
	}

	@Override
	public String toString() {
		// space 배열 변환하기 -> 화면상에 [][][][][][][]
		String s = "";
		int count = 0;
		for(Car car : space) {
			++count;
			if(car != null) {
				
				s += "[" +car.getId()+"]";
			}else {
				s += "[    ]";
			}

			if(count == space.length /2) {
				s += "\n";
			}
		}
		return s;
	}




	public void removeCar(Car car) {
		int del = 1;
		for (int i=0;i<space.length;i++) {
			if(space[i] == car) {
				del = i;
				break;
				
			}
		}
		if (del>= 0) {
			space[del] = null;
		}
		
		space[del] = null;
		
	}
	
	
	
}
