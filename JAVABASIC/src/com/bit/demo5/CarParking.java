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

	public void insert(String id, Date in, Date out, double a) {
		
		Car car = new Car();
		car.setId(id);
		car.setIn(in);
		car.setOut(out);
		car.setPrice(a);
		space[idx] = car;
		idx++;
		System.out.println(space[0]);
		
	}
	
	public void getCar(String num) {
		Car t = space;
			
		
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
				s += "[     ]";
			}

			if(count == space.length /2) {
				s += "\n";
			}
		}
		return s;
	}
	
	
	
}
