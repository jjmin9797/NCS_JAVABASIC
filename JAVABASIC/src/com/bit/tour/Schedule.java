package com.bit.tour;

import java.time.LocalDateTime;
import java.util.Arrays;

// Tour Model_1

//상품정보
//모델이 여러개가 있을 때 이들 간의 관계
public class Schedule {
	
	
	
	
	private int schcode;
	private LocalDateTime schstart;//일정 -가서 , -온다
	private LocalDateTime schend;
	private Place place;//장소 (place)
	private Member mem;
	private int[] schmem;//멤버들 여러명 ! - 배열
	
	
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
