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
		//�����ϱ�
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
	//���۱� !
	public int isEmpty() {
		for (int i=0;i<space.length;i++) {
			if(space[i] == null) { //�迭 ��Ұ� ��ü�̹Ƿ� null
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
		// space �迭 ��ȯ�ϱ� -> ȭ��� [][][][][][][]
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
