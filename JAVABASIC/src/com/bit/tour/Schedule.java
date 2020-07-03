package com.bit.tour;

import java.time.LocalDateTime;
import java.util.Arrays;

// Tour Model_1

//��ǰ����
//���� �������� ���� �� �̵� ���� ����
public class Schedule {
	
	
	
	
	private int schcode;
	private LocalDateTime schstart;//���� -���� , -�´�
	private LocalDateTime schend;
	private Place place;//��� (place)
	private Member mem;
	private int[] schmem;//����� ������ ! - �迭
	
	
	public Schedule(){
		
	}
	
	
	
	public int getSchcode() {
		return schcode;
	}
	public void setSchcode(int schcode) {
		this.schcode = schcode;
	}
	public LocalDateTime getSchstart() {
		return schstart;
	}
	public void setSchstart(LocalDateTime schstart) {
		this.schstart = schstart;
	}
	public LocalDateTime getSchend() {
		return schend;
	}
	public void setSchend(LocalDateTime schend) {
		this.schend = schend;
	}
	public Place getPlace() {
		return place;
	}
	public void setPlace(Place place) {
		this.place = place;
	}
	public Member getMem() {
		return mem;
	}
	public void setMem(Member mem) {
		this.mem = mem;
	}
	public int[] getSchmem() {
		return schmem;
	}
	public void setSchmem(int[] schmem) {
		this.schmem = schmem;
	}



	@Override
	public String toString() {
		return "Schedule [schcode=" + schcode + ", schstart=" + schstart + ", schend=" + schend + ", place=" + place
				+ ", mem=" + mem + ", schmem=" + Arrays.toString(schmem) + "]";
	}
	
	
	
}
