package com.bit.demo5;
//2���� �޼��� 
// 1.  toString()
// 2.  �����ڶ�?

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;

public class CarParking {
	// �����ڴ� new��� ����� ȣ��Ǵ� �޼����̴�. -> �⺻�����ڴ� VM�� ���� �ڵ����� �ۼ��ǰ� ȣ��ȴ� !
	// ��ȯ���� �ƿ� ���� �ʴ´�. Ŭ���� ��� ��ġ
	// �����ڸ� �ۼ��ϸ� �⺻ �����ڴ� ��������...
	// ��ü ���� �� �ʿ��� �ʱ�ȭ �����Ѵ�.
	// ����� �޴´� ...> �ʵ���� ��� ���ڿ��� �����

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
		// space �迭 ��ȯ�ϱ� -> ȭ��� [][][][][][][]
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
